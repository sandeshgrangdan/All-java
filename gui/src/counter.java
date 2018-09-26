
import static com.sun.glass.events.DndEvent.EXIT;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class counter extends JFrame implements ActionListener{
    JLabel lblCounter;
    JTextField txtCounter;
    JButton btnCounter;
    int counter = 0;
    
    public counter(){
        initGUI();
    }
    public final void initGUI(){
        lblCounter =new JLabel("value for counter");
        btnCounter = new JButton("counter");
        txtCounter = new JTextField(counter +"", 10);
        
        setLayout(new FlowLayout());
        
        add(lblCounter);
        add(txtCounter);
        add(btnCounter);
        btnCounter.addActionListener(this);
        
        this.setSize(400, 200);
        this.setTitle("fuck my head");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new counter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        counter = counter + 1;
        txtCounter.setText(counter +"");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
