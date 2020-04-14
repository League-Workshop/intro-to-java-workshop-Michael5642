package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ironGiant=new Robot(); 
	
	ironGiant.setSpeed(10);
	ironGiant.penDown();
	for (int i = 0; i < 100; i++) {
		ironGiant.move(5);
		ironGiant.turn(5);
		
	}
	
	
	
	/*
	
    ironGiant.move(200);
    ironGiant.turn(90);
    ironGiant.move(200);
    ironGiant.turn(90);
    ironGiant.move(200);
    */
    
	}
}
