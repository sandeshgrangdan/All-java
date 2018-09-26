
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class Readfromfolder {
    public static void main(String[] args) {
        
        String [] paths;
        String location ="C://Windows";
        File f = null;
        
        f = new File(location);
        paths = f.list();
        
        for (String path : paths)
        {
            System.out.println(path);
        }
         int s = paths.length;
         for (int i=0; i<s; i++)
         {
             System.out.println("loop:" +paths[i]);
         }
        
    }
}