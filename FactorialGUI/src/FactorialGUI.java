import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
Factorial gives the factorial of any number sent as a parameter or typed in by the user.
*/
public class FactorialGUI extends JFrame {
	private static final long serialVersionUID = 1L;

	public FactorialGUI() {
       setTitle("Factorial");
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE); 
       JTextField input = new JTextField("Invalue",0);
       JButton done = new JButton("Done");
       JButton clear = new JButton("Clear");
       Container pane = getContentPane();
       GroupLayout layout = new GroupLayout(pane);
       pane.setLayout(layout);
       input.setPreferredSize(new Dimension(100, 20));


       layout.setAutoCreateContainerGaps(true);
       layout.setHorizontalGroup(layout.createSequentialGroup()
    		   	.addComponent(clear) 
    		   	.addComponent(input)
                .addComponent(done)
       );

       layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(input)
                .addComponent(done)
                .addComponent(clear)
       );
       
     	done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int value = Integer.parseInt(input.getText());
                int res = factorial(value);
                input.setText(""+res);
                input.setBackground(Color.green);
            }
        });
     	clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	input.setText("0");
            	input.setBackground(Color.white);
            }
        });
     	
 
        pack(); 
    }

	public static void main(String[] args) {
      FactorialGUI ob = new FactorialGUI();
      ob.setVisible(true);
    }

	private int factorial(int value) {
		int res = 1;
		while(value>1) {
			res = res * value;
			value--;
		}
		return res;
	}
}