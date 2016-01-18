/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.controllers;

import br.al.contractmanager.dao.UsuarioDao;
import br.al.contractmanager.models.Usuario;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

@Component
@Scope(value = "session")
public class UsuarioController implements Serializable {
    
    @Autowired
    private transient UsuarioDao usuarioDao;
    
    private Usuario usuario;
    
    private Usuario itemSelecionado;
    
    public void novoUsuario() {
        usuario = new Usuario();
    }
    
    public void salvaUsuario() {
        usuarioDao.adicionar(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getItemSelecionado() {
        return itemSelecionado;
    }

    public void setItemSelecionado(Usuario itemSelecionado) {
        this.itemSelecionado = itemSelecionado;
    }
}


