package CalcTest;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calc {

	public static void main(String[] args) {
		JPanel windowContent = new JPanel();
		GridLayout f1 = new GridLayout(4, 2,5,5);
		windowContent.setLayout(f1);
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		
		JLabel label3 = new JLabel("Sum :");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		JFrame frame = new JFrame("My first calc");
		frame.setContentPane(windowContent);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		

	}

}
