/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfromzip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author sandesh
 */
public class ReadFromzip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filelocation = "E://testfolder.zip";
        FileInputStream fis = null;
        ZipInputStream zis= null;
        ZipEntry ze = null;
       try{
           fis = new FileInputStream(filelocation);
           BufferedInputStream bis = new BufferedInputStream(fis);
           zis = new ZipInputStream(bis);
           while((ze=zis.getNextEntry()) != null) {
               System.out.println(ze.getName());
           }
       } catch (FileNotFoundException ex) {
           System.out.println("error  fuck :" +ex.toString());
            Logger.getLogger(ReadFromzip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFromzip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
