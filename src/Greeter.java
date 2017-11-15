import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, " Please enter your name to continue.");
	String name=JOptionPane.showInputDialog("Enter you name below");
	System.out.println(name);
JOptionPane.showMessageDialog(null, "Hello "+name);
}
}
