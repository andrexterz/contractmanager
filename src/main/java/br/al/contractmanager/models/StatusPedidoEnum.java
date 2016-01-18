/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */


public enum StatusPedidoEnum {
    
    ABERTO("aberto"),
    EM_PRODUCAO("em produção"),
    PARA_APROVACAO("para aprovação"),
    APROVADO("aprovado"),
    AUTORIZADO("autorizado"),
    ENVIADO("enviado"),
    CONCLUIDO("concluído"),
    CANCELADO("cancelado");
    
    private final String nome;
    
    private StatusPedidoEnum(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
