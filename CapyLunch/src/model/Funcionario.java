/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Funcionario {
    
    private int id,nivel;
    private String nome,datan,cpf,senha,cargo;
    private float salario;

    public Funcionario(int id, int nivel, String nome, String datan, String cpf, String senha, String cargo, float salario) {
        this.id = id;
        this.nivel = nivel;
        this.nome = nome;
        this.datan = datan;
        this.cpf = cpf;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int id, int nivel, String senha) {
        this.id = id;
        this.nivel = nivel;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatan() {
        return datan;
    }

    public void setDatan(String datan) {
        this.datan = datan;
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
    
    
    
     
}
