
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class Mainclass {
    public static void main(String[] args) {
        Point p;
        p = new Point((float) 4.4, (float) 7.5);
        MoveablePoint m = new MoveablePoint((float) 2.6, (float) 5.6);
        // float san[] = m.move();
        //float san[] = m.move();
        System.out.println(p.toString());
        System.out.println(m.toString());
       // System.out.println(Arrays.toString(san));
    }
    
}
