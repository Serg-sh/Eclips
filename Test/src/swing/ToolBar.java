package swing;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.Canvas;


public class ToolBar {
	String[] elements = new String[] {"Вася", "Петя","<html><font size = +1 color = yellow>Иван</font>", "Сергей"};
		ToolBar(){
		JPanel panel = new JPanel(new BorderLayout());
		JTextArea ta = new JTextArea(5, 20);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		JToolBar tb = new JToolBar("Инструментальная панель");
		tb.add(new JButton("But_1"));
		tb.add(new JButton("But_2"));
		tb.addSeparator();
		tb.add(new JButton("But_3"));
		JComboBox cb = new JComboBox(elements);
		panel.add("North", tb);
		panel.add("Center", ta);
		panel.add("South", cb);
		JFrame frame = new JFrame("MenuPanel");
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		
		
	}
		public static void main(String[]args){
			ToolBar toolb = new ToolBar();
		}

	


}
