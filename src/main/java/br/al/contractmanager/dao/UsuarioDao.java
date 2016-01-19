/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.dao;

import br.al.contractmanager.models.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */
@Repository
@Scope(value = "singleton")
public class UsuarioDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public boolean adicionar(Usuario usuario) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(usuario);
            return true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Transactional
    public boolean atualizar(Usuario usuario) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.update(usuario);
            return true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean excluir(Usuario usuario) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.delete(usuario);
            return true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Transactional(readOnly = true)
    public List<Usuario> listarTodos() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Usuario buscar(Long id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            return session.get(Usuario.class, id);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Transactional(readOnly = true)
    public List<Usuario> buscar(String termo) {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Usuario.class)
                .add(Restrictions.or(Restrictions.eq("matricula", termo),
                        Restrictions.like("nomeUsuario", termo, MatchMode.ANYWHERE).ignoreCase(),
                        Restrictions.like("nomeCompleto", termo, MatchMode.ANYWHERE).ignoreCase()))
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
                .list();
    }

    @Transactional(readOnly = true)
    public int count() {
        Session session = sessionFactory.getCurrentSession();
        try {
            Criteria criteria = session.createCriteria(Usuario.class);
            criteria.setProjection(Projections.distinct(Projections.id()));
            return ((Long) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Transactional(readOnly = true)
    public int count(String termo) {
        Session session = sessionFactory.getCurrentSession();
        try {
            Criteria criteria = session.createCriteria(Usuario.class);
            criteria.add(Restrictions.or(Restrictions.eq("matricula", termo),
                    Restrictions.like("nomeUsuario", termo, MatchMode.ANYWHERE).ignoreCase(),
                    Restrictions.like("nomeCompleto", termo, MatchMode.ANYWHERE).ignoreCase()))
                    .setProjection(Projections.distinct(Projections.id()));
            return ((Long) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
