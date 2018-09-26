
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class appendContain {
    public static void main(String[] args){
        String filePath = "D://try.txt";
        try {
            try (FileOutputStream fos = new FileOutputStream(filePath,true)) {
                String appendcontain = "\n i have added it ";
                fos.write(appendcontain.getBytes());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error :" +ex.toString());
        } catch (IOException ex) {
            System.out.println("Error :" +ex.toString());
            //Logger.getLogger(appendContain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
    
}
