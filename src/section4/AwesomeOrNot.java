package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
     Random number=new Random();
     int randomnumber = number.nextInt(4);
	// 3. Print out this variable
   System.out.println(randomnumber);
	// 4. Get the user to enter something that they think is awesome
   JOptionPane.showInputDialog("what do you think is awesome?");
	// 5. If the random number is 0
if (randomnumber==0); {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, "thats dumb...");}

	// 6. If the random number is 1
if (randomnumber==1); {JOptionPane.showMessageDialog(null, "ehh, that's alright");}
if (randomnumber==2); {JOptionPane.showMessageDialog(null, "that's amazing!");}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (randomnumber==3); {JOptionPane.showMessageDialog(null, "I don't like that");}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (randomnumber==4); {JOptionPane.showMessageDialog(null, "I hate you...");}
	// -- write your own answer

}
}

