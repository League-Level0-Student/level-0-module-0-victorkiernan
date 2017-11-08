import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot cheese=new Robot("vic");
	cheese.penDown();
	cheese.sparkle();
	cheese.setSpeed(500);
	for (int i = 0; i < 100000000; i++) {
		cheese.setRandomPenColor();
		cheese.move(250);
		cheese.turn(90);
		
	}
	

	}
	
}
