/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.controllers;

import org.springframework.stereotype.Component;


/**
 *
 * @author andre
 */


@Component
public class ArquivoController {
    
    public ArquivoController() {
        
    }
    
    private String filename = "my file name here";
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
}
