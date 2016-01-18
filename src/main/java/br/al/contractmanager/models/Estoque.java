/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

//@Entity
public class Estoque extends Base {
    

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicioContrato;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date terminoContrato;
    
    private List<ItemEstoque> itens;
}
