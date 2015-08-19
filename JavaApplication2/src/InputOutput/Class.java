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
        Gamer gamer = new Gamer(nome, 0, 0, 0);
        
        File file = new File("scoreData.txt");
        Gamer gamer2 = IOManager.readGamer(file);
        if(gamer.getName().equalsIgnoreCase(gamer2.getName())){
            gamer = gamer2;
            System.out.println("------------------------");
            System.out.println("Gamer: "+gamer.getName());
            System.out.println("Maior pontuação: "+gamer.getMax_score());
            System.out.println("Última pontuação: "+gamer.getLast_score());
            MainGame mg = new MainGame(gamer);
        }
        else{
            System.out.println("Esse é um jogo exclsivo");
        }
        
        
        
//        IOManager.writeGamer(gamer, file);
//        
//        System.out.println("O Gamer escrito foi: "+gamer);
//        
//        Gamer gamer2 = IOManager.readGamer(file);
//        
//        System.out.println("Gamer lido: "+gamer2);
        
        
    }
}
