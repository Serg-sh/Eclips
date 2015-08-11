package SmalCalc;

import javax.swing.*;

import java.awt.Insets;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.Font;


public class SimpleCalculator {
	public static void main(String[] args) {
		 // Создаём панель
		JPanel windowContent= new JPanel();
		 // Создаём фрейм и задаём для него панель
		  JFrame frame = new JFrame("My First Calculator");
		  frame.setResizable(false);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setContentPane(windowContent);
		 windowContent.setLayout(new FormLayout(new ColumnSpec[] {
		 		FormFactory.UNRELATED_GAP_COLSPEC,
		 		ColumnSpec.decode("35px:grow"),
		 		FormFactory.RELATED_GAP_COLSPEC,
		 		ColumnSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_COLSPEC,
		 		ColumnSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_COLSPEC,
		 		ColumnSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_COLSPEC,
		 		ColumnSpec.decode("35px"),
		 		FormFactory.UNRELATED_GAP_COLSPEC,},
		 	new RowSpec[] {
		 		FormFactory.UNRELATED_GAP_ROWSPEC,
		 		RowSpec.decode("50px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.RELATED_GAP_ROWSPEC,
		 		RowSpec.decode("35px"),
		 		FormFactory.UNRELATED_GAP_ROWSPEC,}));
		 
		 JFormattedTextField formattedTextField = new JFormattedTextField();
		 formattedTextField.setFocusable(false);
		 formattedTextField.setMargin(new Insets(5, 5, 5, 5));
		 formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		 formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		 windowContent.add(formattedTextField, "2, 2, 9, 1, fill, fill");
		 
		 
		 
		 JButton btnNewButton_2 = new JButton("MC");
		 btnNewButton_2.setFocusPainted(false);
		 btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_2, "2, 4, fill, fill");
		 
		 JButton btnNewButton_3 = new JButton("MR");
		 btnNewButton_3.setFocusPainted(false);
		 btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_3, "4, 4, fill, fill");
		 
		 JButton btnNewButton_4 = new JButton("MS");
		 btnNewButton_4.setFocusPainted(false);
		 btnNewButton_4.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_4, "6, 4, fill, fill");
		 
		 JButton btnNewButton_5 = new JButton("M+");
		 btnNewButton_5.setFocusPainted(false);
		 btnNewButton_5.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_5, "8, 4, fill, fill");
		 
		 JButton btnNewButton_6 = new JButton("M-");
		 btnNewButton_6.setFocusPainted(false);
		 btnNewButton_6.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_6, "10, 4, fill, fill");
		 
		 JButton btnNewButton_7 = new JButton("<--");
		 btnNewButton_7.setFocusPainted(false);
		 btnNewButton_7.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_7, "2, 6, fill, fill");
		 
		 JButton btnNewButton_8 = new JButton("CE");
		 btnNewButton_8.setFocusPainted(false);
		 btnNewButton_8.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_8, "4, 6, fill, fill");
		 
		 JButton btnNewButton_9 = new JButton("C");
		 btnNewButton_9.setFocusPainted(false);
		 btnNewButton_9.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_9, "6, 6, fill, fill");
		 
		 JButton btnNewButton_10 = new JButton("+-");
		 btnNewButton_10.setFocusPainted(false);
		 btnNewButton_10.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_10, "8, 6, fill, fill");
		 
		 JButton btnNewButton_11 = new JButton("?");
		 btnNewButton_11.setFocusPainted(false);
		 btnNewButton_11.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_11, "10, 6, fill, fill");
		 
		 JButton btnNewButton_12 = new JButton("7");
		 btnNewButton_12.setFocusPainted(false);
		 btnNewButton_12.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_12, "2, 8, fill, fill");
		 
		 JButton btnNewButton_13 = new JButton("8");
		 btnNewButton_13.setFocusPainted(false);
		 btnNewButton_13.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_13, "4, 8, fill, fill");
		 
		 JButton btnNewButton_14 = new JButton("9");
		 btnNewButton_14.setFocusPainted(false);
		 btnNewButton_14.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_14, "6, 8, fill, fill");
		 
		 JButton btnNewButton_15 = new JButton("/");
		 btnNewButton_15.setFocusPainted(false);
		 btnNewButton_15.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_15, "8, 8, fill, fill");
		 
		 JButton btnNewButton_16 = new JButton("%");
		 btnNewButton_16.setFocusPainted(false);
		 btnNewButton_16.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_16, "10, 8, fill, fill");
		 
		 JButton btnNewButton_17 = new JButton("4");
		 btnNewButton_17.setFocusPainted(false);
		 btnNewButton_17.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_17, "2, 10, fill, fill");
		 
		 JButton btnNewButton_18 = new JButton("5");
		 btnNewButton_18.setFocusPainted(false);
		 btnNewButton_18.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_18, "4, 10, fill, fill");
		 
		 JButton btnNewButton_19 = new JButton("6");
		 btnNewButton_19.setFocusPainted(false);
		 btnNewButton_19.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_19, "6, 10, fill, fill");
		 
		 JButton btnNewButton_20 = new JButton("*");
		 btnNewButton_20.setFocusPainted(false);
		 btnNewButton_20.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_20, "8, 10, fill, fill");
		 
		 JButton btnNewButton_21 = new JButton("1/x");
		 btnNewButton_21.setFocusPainted(false);
		 btnNewButton_21.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_21, "10, 10, fill, fill");
		 
		 JButton btnNewButton_22 = new JButton("1");
		 btnNewButton_22.setFocusPainted(false);
		 btnNewButton_22.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_22, "2, 12, fill, fill");
		 
		 JButton btnNewButton_23 = new JButton("2");
		 btnNewButton_23.setFocusPainted(false);
		 btnNewButton_23.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_23, "4, 12, fill, fill");
		 
		 JButton btnNewButton_24 = new JButton("3");
		 btnNewButton_24.setFocusPainted(false);
		 btnNewButton_24.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_24, "6, 12, fill, fill");
		 
		 JButton btnNewButton_25 = new JButton("-");
		 btnNewButton_25.setFocusPainted(false);
		 btnNewButton_25.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_25, "8, 12, fill, fill");
		 
		 JButton btnNewButton = new JButton("=");
		 btnNewButton.setFocusPainted(false);
		 btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton, "10, 12, 1, 3, fill, fill");
		 
		 JButton btnNewButton_1 = new JButton("0");
		 btnNewButton_1.setFocusPainted(false);
		 btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(btnNewButton_1, "2, 14, 3, 1, fill, fill");
		 
		 JButton button = new JButton(",");
		 button.setMargin(new Insets(0, 0, 0, 0));
		 button.setFocusPainted(false);
		 windowContent.add(button, "6, 14, fill, fill");
		 
		 JButton button_1 = new JButton("+");
		 button_1.setMargin(new Insets(0, 0, 0, 0));
		 windowContent.add(button_1, "8, 14, fill, fill");
		 
		 
		 
		 
		 
		 // задаём размер и делаем фрейм видимым
		 frame.pack();
		 frame.setVisible(true);
		}

}
