package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] r = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot("batman");
			r[i].setY(500);
			r[i].setX(50 + 100 * i);
			r[i].setSpeed(500);
			
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean isRacing = true;
		while (isRacing == true) {

			for (int i = 0; i < r.length; i++) {
				r[i].move(30);
				r[i].turn(10);
				if (r[i].getY()==501&&r[i].getX()<500) {
				isRacing=false;	
				JOptionPane.showMessageDialog(null, "Robot "+ i + " won!");
				}
			
				}
			
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}