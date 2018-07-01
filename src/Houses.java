import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot rob = new Robot();

	public static void main(String[] args) {			
		rob.miniaturize();
		rob.hide();
		rob.setSpeed(100);
		rob.turn(180);
		rob.move(100);
		rob.turn(90);
		rob.move(250);
		rob.penDown();
		rob.turn(180);
		Houses house = new Houses();
		for (int i=0;i<10;i++) {
		house.house();
		}
	}
	
	static void house() {
		color();
		Random gen = new Random();
		int x = gen.nextInt(100)+20;
		rob.turn(270);
		rob.move(x);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(x);
		
		rob.setPenColor(69, 209, 48);
		rob.turn(270);
		rob.move(15);
	}
	
	static void color() {
		Random red = new Random();
		int r = red.nextInt(256);
		Random green = new Random();
		int g = green.nextInt(256);
		Random blue = new Random();
		int b = blue.nextInt(256);
		rob.setPenColor(r,g,b);
	}
}
