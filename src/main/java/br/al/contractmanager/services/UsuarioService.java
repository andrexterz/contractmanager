/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.services;

import br.al.contractmanager.dao.UsuarioDao;
import br.al.contractmanager.models.Usuario;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author andre
 */

@RestController
@RequestMapping("/usuario")
public class UsuarioService implements Serializable {
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @RequestMapping(path="/{id}", method = RequestMethod.GET)
    public Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioDao.buscar(id);
    }
    
}
