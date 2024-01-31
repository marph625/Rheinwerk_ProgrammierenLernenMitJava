/* Beispiel mit Programmfenster
 */

import java.awt.*;
import javax.swing.*;

public class GrussMitProgrammfenster extends JFrame {
	public GrussMitProgrammfenster() {
		super("I like Gary");

		var icon = new ImageIcon("gary_spongebob.jpg");
		var label1 = new JLabel("Gary for", JLabel.CENTER);
		var label2 = new JLabel("President!", JLabel.CENTER);
		var label3 = new JLabel(icon);
		var schrift = new Font("SansSerif", Font.BOLD, 24);
		label1.setFont(schrift);
		label1.setForeground(Color.red);
		label2.setFont(schrift);
		label2.setForeground(Color.red);
		var c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GrussMitProgrammfenster();
	}
}
