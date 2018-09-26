
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class replace {
     public static void main(String[] args){
        String filepath = "D://sand.txt";
        
         try {
             String strs="dsnfhhsbd bsdbc bsdbfbcb";
             FileReader fs = new FileReader(filepath);
             BufferedReader str = new BufferedReader(fs);
             String line= "",after="";
            while((line = str.readLine()) != null)
            {
              after = line;
              line = line.replace('d','f');
              System.out.println("before =" +after);
              System.out.println("after =" +line);
            }
            
             
         } catch (FileNotFoundException ex) {
             Logger.getLogger(word.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(word.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
