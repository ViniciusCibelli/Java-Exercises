import javax.swing.JOptionPane;

public class FifthVideo {

	public static void main(String[] args) {

		String hero = "";
		
		hero = JOptionPane.showInputDialog(null, "What is your favorite super hero?");
		
		//String hero = JOptionPane.showInputDialog(null, "What is your favorite super hero?");
		
		JOptionPane.showMessageDialog(null, "Your favorite hero is: " + hero);
	}

}
