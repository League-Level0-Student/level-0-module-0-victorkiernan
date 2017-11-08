import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
 public static void main(String[] args) {
	Robot derp=new Robot("batman");
	derp.sparkle();
	derp.setSpeed(10);
	derp.penDown();
	for (int i = 0; i < 1000000; i++) {
		derp.setRandomPenColor();
		derp.turn(25);
		derp.move(250);
		derp.move(-250);
		derp.turn(-50);
		derp.setRandomPenColor();
		derp.move(250);
		derp.move(-250);
		derp.turn(25);	
	}
	
}
}
