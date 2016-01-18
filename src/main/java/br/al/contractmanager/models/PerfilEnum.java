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
public enum PerfilEnum {
    
    ADMINISTRADOR("Administrador"),
    GERENTE("Gerente"),
    USUARIO("Usuário");
    
    private final String perfil;
    
    private PerfilEnum(String perfil) {
        this.perfil = perfil;
    }
    
    public String getPerfil() {
        return perfil;
    }
    
}
