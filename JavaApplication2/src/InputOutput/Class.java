/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.File;

/**
 *
 * @author 41406133
 */
public class Class {
    public static void main(String[] args) {
        String nome = IOManager.readKey("Qual seu nome? ");
        System.out.println("Seu nome é: " + nome);
        Gamer gamer = new Gamer(nome, 0, 0);
        
        File file = new File("scoreData.txt");
        
        IOManager.writeGamer(gamer, file);
        
        System.out.println("O Gamer escrito foi: "+gamer);
        
        Gamer gamer2 = IOManager.readGamer(file);
        
        System.out.println("Gamer lido: "+gamer2);
    }
}
