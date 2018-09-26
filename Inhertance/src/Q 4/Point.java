/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class Point {
    float x=(float) 0.00,y=(float) 0.0,mul;
     Point (float x,float y){
     this.x=x;
     this.y=y;
     }
     Point(){
         x=(float) 0.0;
         y=(float) 0.0;
     }
     float getX()
     {
         return this.x;
     }
     float getY()
     {
         return this.y;
     }
     float getXY()
     {
         return this.mul;
     }
     void setX()
     {
         this.x=x;
     }
     void setY(){
     this.y=y;
     }
    void setXY(float x,float y)
    {
       this.mul=x*y;
    }
    @Override
    public String toString(){
        return("X = " +this.x+ " Y= " +this.y+ "\n Point is: (" +this.x+ "," +this.y+ ")" );     
    }
}
