import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Example {
	// Step one create static variables
    private static JFrame f;
    private static ImageIcon icon;
    private static JTextField textfield1, textfield2, textfield3;

    public static void main(String[] args) {
		// Step two add variables
        f = new JFrame("Text Field Examples");
        // The program dosent know what this is??
        // f.getContentPane().setLayout(new FlowLayout());


		textfield1 = new JTextField("Hi",10);
    	textfield2 = new JTextField("Hello",10);
	    textfield3 = new JTextField("Howdy",10);        

        try {
            icon = new ImageIcon("images/middle.gif");            
        } catch (Exception e) {
            System.out.println("Could not find image, Try to check the path or spelling!");
        }

		// Step three pack items
        f.getContentPane().add(textfield1);
		f.getContentPane().add(textfield2);
		f.getContentPane().add(textfield3);
		f.pack();

		// Step 4 show frame
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}