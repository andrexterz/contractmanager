/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

//@Entity
public class ItemEstoque extends Base {
    
    @ManyToOne
    private Fornecedor fornecedor;
    
    @ManyToOne
    private Produto produto;
    
    private Double preco;
    
}
