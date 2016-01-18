/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

//@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Interessado extends Base {
    
    private String nome;
    private List<Contato> contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        for (Contato cont:contatos) {
            cont.setInteressado(this);
        }
        this.contatos = contatos;
    }
    
    public void addContato(Contato contato) {
        contato.setInteressado(this);
        contatos.add(contato);
    }
    
}
