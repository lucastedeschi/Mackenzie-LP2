/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Exercicio3 {
    private ArrayList<Beaches> beaches;

        public void addBeaches(String nome, double km){
            Beaches c = new Beaches(nome, km);
            beaches.add(c);
        }
    /**
     * @param args the command line arguments
     */

    
}
