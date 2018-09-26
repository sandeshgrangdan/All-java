
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class word {
     public static void main(String[] args){
        String filepath = "D://sand.txt";
        String[] s;
        String st ="",lg="";
         try {
             //String strs="dsnfhhsbd bsdbc bsdbfbcb";
             FileReader fs = new FileReader(filepath);
             BufferedReader str = new BufferedReader(fs);
             String line= null;
            while((line = str.readLine()) != null)
            {
              s = line.split("\\s");
              st=s[0];
              for(String s1:s)
              {
                  if(s1.length()<st.length())
                      st=s1;
                  else if(s1.length()>lg.length())
                      lg=s1;
              }
            }
            System.out.println("shortest =" +st);
            System.out.println("logest =" +lg);
             
         } catch (FileNotFoundException ex) {
             Logger.getLogger(word.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(word.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
