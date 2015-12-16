package level0b;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			int random = new Random().nextInt(49)+1;
JOptionPane.showMessageDialog(null, random);
		}
		
}

}
