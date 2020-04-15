package section3;

import javax.swing.JOptionPane;

public class HelloWorld {

	
	public static void main(String[] args) {
	System.out.println("Hello World!");
    JOptionPane.showMessageDialog(null, "   Hello World   ");  
	String name=JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "Hello " + name);
	String condition=JOptionPane.showInputDialog("how are you today?");
	}



}
