 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attribute;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/**
 *
 * @author sandesh
 */
public class Attribute {
    private static Object overview;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String name = "D://sand.txt";
        File sand= new File(name);
        
         System.out.println("bytes"+sand.length());
         long leng = (sand.length()/1024);
         System.out.println(+leng);
         
         if(sand.isHidden())
         {
             System.out.println("file is hidden");
         }
         else
         {
             System.out.println("file is not hidden");
         }
         if(sand.canWrite()== true)
         {
             System.out.println("we can   write");
         }
         else
         {
             System.out.println("we camnnot write");
         }
        Path pathfile;
        pathfile = Paths.get(name);
        
        FileOwnerAttributeView ownerview = Files.getFileAttributeView(pathfile, FileOwnerAttributeView.class);
        UserPrincipal ownername = ownerview.getOwner();
        String owner = ownername.getName();
        
        String s = ownerview.getOwner().getName();
        BasicFileAttributes atrs = Files.readAttributes(pathfile, BasicFileAttributes.class);
        
        System.out.println("Owner info: " +owner);
        printData(s,pathfile, atrs);
    }
    public static void printData(String sa,Path paths, BasicFileAttributes atrs)
    {
        long kb = (atrs.size());
        System.out.println("file Owner :" + sa);
        System.out.println("file name :" + paths.getFileName());
        System.out.println("file path :" + paths);
        System.out.println("file created date. :" + atrs.creationTime());
        System.out.println("file last modified date :" + atrs.lastModifiedTime());
        System.out.println("file last accessed time :" + atrs.lastAccessTime());
        System.out.println("file size :" + atrs.size() + " bytes");
        System.out.println("in kb:" +kb);
    }
    
    
}
