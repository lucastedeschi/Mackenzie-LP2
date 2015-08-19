/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 41406133
 */
public class IOManager {
    
    public static String readKey(String inst){
        String result = "";
        System.out.println(inst);
                
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(isReader);
        
        try {
            result = bReader.readLine();
        } catch (IOException ex) {
            result = "Babaca! Deu ruim na leitura";
            Logger.getLogger(IOManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public static void writeGamer(Gamer gamer, File file){
        
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gamer);
            oos.close();
            fos.close();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        
    }
    
    public static Gamer readGamer(File file){
        Gamer gamer = null;
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            gamer = (Gamer) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException iOException) {
            iOException.printStackTrace();
        }

        return gamer;
    }
    
}
