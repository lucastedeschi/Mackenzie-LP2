/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.File;
import java.util.Random;

/**
 *
 * @author 41406133
 */
public class MainGame {
    
    private Gamer gamer;
    private int randomInt;
    
    public MainGame(Gamer gamer){
        this.gamer = gamer;
        
        boolean cont = true;
        
        do{
            String resp = IOManager.readKey("Você quer jogar? (S/N)");
            if(resp.equalsIgnoreCase("S")){
               gameLogic(); 
            }
            else{cont = false;}
        } while(cont); //cont == true
        
        
        String resp2 = IOManager.readKey("Quer salvar o seu jogo? (S/N)");
        if(resp2.equalsIgnoreCase("s")){
            //Troca a ultima pontuação pela atual
            gamer.setLast_score(gamer.getCurrent_score());
            //Verifica se pe maior q a máxima
            if(gamer.getCurrent_score() > gamer.getMax_score()){
                gamer.setMax_score(gamer.getCurrent_score());
            }
            //Salva o jogo
            File file = new File("scoreData.txt");
            IOManager.writeGamer(gamer, file);
            System.out.println("Seu jogo foi salvo com sucesso!");
        }
        System.out.println("Jogo finalizado.");
    }
    
    public void gameLogic(){
        randomInt = randomize(0,10);
        
        System.out.println("Numero gerado: "+randomInt);
        int gamerInt = Integer.parseInt(IOManager.readKey("Advinha meu número (0-10)!"));
        if(gamerInt == randomInt){
            System.out.println("Acertou!");
            gamer.incrementScore();
        }
            else{
                    System.out.println("Babaca, errou!");
                }
        System.out.println("Você tem : " + gamer.getCurrent_score()+" pontos");
    }

    public int randomize(int min, int max){
        return (int)(min+(Math.random() * (max - min + 1)));
    }
}
