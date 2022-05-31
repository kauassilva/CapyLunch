/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Pedro
 */
public class Comidas {
    private String alimento;
    private String valor;
    
    public Comidas(String alimento, String valor){
        this.alimento=alimento;
        this.valor=valor;       
    }
    
    public void setAlimento(String alimento){
        this.alimento=alimento;
    }
    
    public String getAlimento(){
        return alimento;
    }
    
    public void setValor(String valor){
        this.valor=valor;
    }
    
    public String getValor(){
        return valor;
    }
    
}
