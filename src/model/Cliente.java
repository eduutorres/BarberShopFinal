/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Luiz Torres
 */
public class Cliente extends Pessoa {
    
    private String telefone;
    private String cep;

    public Cliente(String telefone, String cep, int id, String nome, char sexo, String dataNasci, String celular, String email, String cpf, String endereco) {
        super(id, nome, sexo, dataNasci, celular, email, cpf, endereco);
        this.telefone = telefone;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String telefone, String cep) {
        super(id, nome);
        this.telefone = telefone;
        this.cep = cep;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
}
