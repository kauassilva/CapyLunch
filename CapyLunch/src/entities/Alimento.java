/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Pedro
 */
public class Alimento {
    private String nome;
    private float valor;
    
    public Alimento(String nome, float valor){
        this.nome = nome;
        this.valor = valor;       
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setValor(float valor){
        this.valor=valor;
    }
    
    public float getValor(){
        return valor;
    }
    
}
