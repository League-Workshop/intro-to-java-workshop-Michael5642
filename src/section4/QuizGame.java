package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("What is the square root of 144?");
		// 3.  Use an if statement to check if their answer is correct
		if (question.equalsIgnoreCase("12")) { JOptionPane.showMessageDialog(null, "CORRECT!"); 
		score=score+1;
		} 
		else { JOptionPane.showMessageDialog(null, "incorrect");
		score=score-1;
		}
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String questionTwo = JOptionPane.showInputDialog("solve for x: 12 * x = 36");
		// 3.  Use an if statement to check if their answer is correct
		if (questionTwo.equalsIgnoreCase("3")) { JOptionPane.showMessageDialog(null, "CORRECT!"); 
		score=score+1;
		} 
		else { JOptionPane.showMessageDialog(null, "incorrect");
		score=score-1;}
		String questionThree = JOptionPane.showInputDialog("find the area of a square with side"
				+ " lengths of 9");
		// 3.  Use an if statement to check if their answer is correct
		if (questionThree.equalsIgnoreCase("81")) { JOptionPane.showMessageDialog(null, "CORRECT!"); 
		score=score+1;
		} 
		else { JOptionPane.showMessageDialog(null, "incorrect");
		score=score-1;
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your score was:" + score);
	
}
		
		
		
}
		
		
	}

		
		
		
		
		
		
		
		
		
		
		