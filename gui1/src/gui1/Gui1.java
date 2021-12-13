
package gui1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Gui1 extends JFrame{
    
    Gui1()
    {
setSize(400,400);
FlowLayout fobj=new FlowLayout();
setLayout(new FlowLayout());//WHAT IS LAYOUT
Panel pobj = new Panel(fobj);
pobj.setSize(100,100);
pobj.setBackground(Color.RED);
//pobj.add(btn);

setBackground(Color.PINK);
JButton btn=new JButton ("my button");
JTextField text = new JTextField(15);

btn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String k = text.getText();
        JOptionPane.showMessageDialog(null,"Hello "+ k);
    }
});
setTitle("my first lab class");
setResizable(false);
setLocationRelativeTo(null);



add(text);
add(btn);
add(pobj);
setVisible(true);





    }
    public static void main(String[] args) {
        Gui1 g = new Gui1();
        Gui1 h = new Gui1();
     
        
        
    }
    
}
