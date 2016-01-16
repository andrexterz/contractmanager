/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.controllers;

import br.al.contractmanager.dao.ArquivoDao;
import br.al.contractmanager.models.Arquivo;
import java.io.Serializable;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca (andrexterz@gmail.com)
 */


@Component
@Scope(value = "session")
public class ArquivoController implements Serializable {
    
    @Autowired
    private transient ArquivoDao arquivoDao;
    
    private Arquivo arquivo;
    
    public ArquivoController() {
        
    }
    
    private String filename = "my file name here";
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public void printMessage() {
        System.out.println("button clicked");
    }
    
    public void createArquivo() {
        Arquivo arq = new Arquivo();
        arq.setNome(UUID.randomUUID().toString());
        arq.setTipo("image/jpeg");
        arq.setConteudo(null);
        System.out.format("Arquivo: %s\n%s\n%s", arq.getNome(), arq.getTipo(), arq.getConteudo());
        arquivoDao.adicionar(arq);
    }

    /**
     * @return the arquivo
     */
    public Arquivo getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
    
}
