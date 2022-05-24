/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;
import view.Login;


public class Funcionario {
    Login login = new Login();
    private int id;
    private String nome,dataNasc,cpf,senha,cargo;
    private float salario;

    // Construtor para o cadastro
    public Funcionario(int id, String nome, String dataNasc, String cpf, String senha, String cargo, float salario) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Construtor para o login
    public Funcionario(int id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String datan) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void validaLogin() {
        if (id==1952 && senha=="2305") {
            System.out.println("Deu tudo certo campeão!");
        } else {
            JOptionPane.showMessageDialog(null,"Email e/ou senha inválido(s)","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     
}
