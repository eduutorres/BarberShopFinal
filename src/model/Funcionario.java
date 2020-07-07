/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luiz Torres
 */
public class Funcionario extends Pessoa{
    
    private String login;
    private String senha;
    private String nvAcesso;

    public Funcionario() {
        super(0, null);
    }
    public Funcionario(int id, String login, String nome, String senha) {
        super(id, nome);
        this.login = login;
        this.senha = senha;
    }

    public Funcionario(String senha, String nvAcesso, int id, String nome, char sexo, String dataNasci, String celular, String email, String cpf, String endereco) {
        super(id, nome, sexo, dataNasci, celular, email, cpf, endereco);
        this.senha = senha;
        this.nvAcesso = nvAcesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNvAcesso() {
        return nvAcesso;
    }

    public void setNvAcesso(String nvAcesso) {
        this.nvAcesso = nvAcesso;
    }

    
}
