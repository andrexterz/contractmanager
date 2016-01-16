/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.dao;

import br.al.contractmanager.models.Arquivo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author andre
 */
@Repository
@Scope(value = "singleton")
public class ArquivoDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public boolean adicionar(Arquivo arquivo) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(arquivo);
            return true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return false;  
    }
}
