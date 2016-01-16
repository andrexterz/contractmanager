/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import javax.persistence.Entity;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

@Entity
public class Produto extends Base {

    public Produto() {
    }

    public Produto(String codigo, String nome, String descricao, String unidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.unidade = unidade;
    }
    
    private String codigo;
    private String nome;
    private String descricao;
    private String unidade;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
}
