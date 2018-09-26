/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelab;

/**
 *
 * @author HP
 */
public class Cirlcle implements Shape {
    Cirlcle(){
        
    }

    @Override
    public void draw() {
       System.out.println("Circle Drawn");
        
    }

    @Override
    public void resize() {
         System.out.println("Circle Resized");
    }
   
    
    
}
