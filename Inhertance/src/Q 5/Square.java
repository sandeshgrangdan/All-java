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
public class Square extends Rectangle{
    @Override
    public void draw(){
        System.out.println("Square Drawn");
    }
    
    @Override
    public void resize(){
        System.out.println("Square Resized");
    }
            
}
