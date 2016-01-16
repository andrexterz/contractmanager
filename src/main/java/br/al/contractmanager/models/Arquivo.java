/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import javax.persistence.Entity;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca (andrexterz@gmail.com)
 */

@Entity
public class Arquivo extends Base {

    public Arquivo() {
    }
    
    public Arquivo(String nome, byte[] conteudo, String tipo) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.tipo = tipo;
    }
    
    private String nome;
    
    private byte[] conteudo;
    
    private String tipo;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the conteudo
     */
    public byte[] getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
