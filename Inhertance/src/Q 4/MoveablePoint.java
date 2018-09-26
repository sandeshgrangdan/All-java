/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class MoveablePoint extends Point{
    float xspeed=(float) 0.0,yspeed=(float) 0.0,mult;
    
    MoveablePoint(float x,float y,float xspeed,float yspeed)
    {
        this.x=x;
        this.xspeed=xspeed;
        this.y=y;
        this.yspeed=yspeed;
    }
    MoveablePoint(float xspeed,float yspeed)
    {
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    MoveablePoint()
    {
        xspeed=(float) 0.0;
        xspeed=(float) 0.0;
    }
    float getXspeed()
    {
        return this.xspeed;
    }
    float getYspeed()
    {
        return this.yspeed;
    }
    float[] getSpeed()
    {
       float speed[] = {this.xspeed,this.yspeed};
       return speed;
    }
    void setXspeed(float xspeed)
    {
        this.xspeed=xspeed;
    }
    void setYspeed(float yspeed)
    {
        this.yspeed=yspeed;
    }
    void setXspeed(float xspeed,float yspeed)
    {
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    @Override
    public String toString(){
       return ("(x,y) = ("  +this.x+"," +this.y+") \n (xs,ys) = (" +this.xspeed+ "," +this.yspeed+")");
    
    }
    float[] move(float x,float y)
    {
        float A[] = {x + xspeed , y + yspeed};
        return A;
        
    }
}
