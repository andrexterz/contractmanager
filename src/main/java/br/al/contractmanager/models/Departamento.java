/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

@Entity
public class Departamento extends Base {
    
    private String nome;
    
    @OneToOne
    private Usuario responsavel;
    
    @OneToMany(mappedBy = "departamento")
    private List<Usuario> usuarios;
}
