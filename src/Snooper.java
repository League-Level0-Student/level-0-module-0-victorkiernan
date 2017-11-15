import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Enter Name");
	System.out.println(name);
	String age=JOptionPane.showInputDialog("Enter Age");
	System.out.println(age);
	String hobby=JOptionPane.showInputDialog("Hobby");
	System.out.println(hobby);
	JOptionPane.showMessageDialog(null, "Hello "+name+" you are "+age+ " years old and you like "+hobby+" Good day! :)");











}
}
