package javatutorial.net;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Example {
	static JTextField textfield1, textfield2, textfield3;
	
	 public static void main(String[] args) {
		  	 {
                  JFrame f = new JFrame("Text Field Examples");
		        f.getContentPane().setLayout(new FlowLayout());
		        textfield1 = new JTextField("Hi",10);
    		    textfield2 = new JTextField("Hello",10);
	    	    textfield3 = new JTextField("Howdy",10);
		        f.getContentPane().add(textfield1);
		        f.getContentPane().add(textfield2);
		        f.getContentPane().add(textfield3);
		        f.pack();
                f.setSize(500, 300);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.setVisible(true);
                
                ImageIcon icon = createImageIcon("images/middle.gif");
                label1 = new JLabel("Image and Text");
                label1.setVerticalTextPosition(JLabel.BOTTOM);
                label1.setHorizontalTextPosition(JLabel.CENTER);

                label2 = new JLabel("Text-Only Label");
                label3 = new JLabel(icon);
              }	  

		    
		  }
}