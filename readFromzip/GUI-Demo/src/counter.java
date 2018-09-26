
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
 * @author dikesh
 */
public class counter extends JFrame implements ActionListener{
    JLabel lblCounter;
    JTextField txtCounter;
    JButton btncounter;
    int counter = 0;
    public counter(){
        initGUI();
    }
    public final void initGUI(){
        lblCounter = new JLabel("Value for counter");
        txtCounter = new JTextField(counter+"", 10);
        btncounter = new JButton("Counter");
        this.setLayout(new FlowLayout());
        add(this.lblCounter);
        add(this.txtCounter);
        add(this.btncounter);
        btncounter.addActionListener(this);
        this.setSize(400,200);
        this.setTitle("Counter Demo");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new counter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        txtCounter.setText(counter+"");
    }
}
