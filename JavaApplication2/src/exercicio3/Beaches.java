/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author lucas
 */
public class Beaches {
    private String nome;
    private double km;
    
    public Beaches(String nome, double km){
        this.nome = nome;
        this.km = km;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getKm(){
        return this.km;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " - Km: " + this.km;
    }
    
}
    

