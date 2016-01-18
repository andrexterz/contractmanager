/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models;

import br.al.contractmanager.models.validators.ValidYear;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;

/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */


public class Contrato extends Base {
    
    @ValidYear
     private int ano;
     
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date dataInicio;
     
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date dataTermino;
     
     @Column(columnDefinition = "boolean default false")
     private Boolean expirado;
    
}
