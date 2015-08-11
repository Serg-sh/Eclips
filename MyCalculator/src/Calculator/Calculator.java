package Calculator;

import java.awt.Font;


import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class Calculator {
	
	JFormattedTextField formattedTextField = new JFormattedTextField();
	
	CalculatorEngine cEngine = new CalculatorEngine(this);

	Calculator() {
		JPanel windowContent = new JPanel();
		// Ñמחהא¸ל פנויל ט חאהא¸ל הכÿ םודמ ןאםוכü
		JFrame frame = new JFrame("My First Calculator");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(windowContent);
		windowContent.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("35px:grow"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("35px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("35px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("35px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("35px"),
				FormFactory.UNRELATED_GAP_COLSPEC, }, new RowSpec[] {
				FormFactory.UNRELATED_GAP_ROWSPEC, RowSpec.decode("50px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("35px"),
				FormFactory.UNRELATED_GAP_ROWSPEC, }));

		
		formattedTextField.setFocusable(false);
		formattedTextField.setMargin(new Insets(5, 5, 5, 5));
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		windowContent.add(formattedTextField, "2, 2, 9, 1, fill, fill");

		JButton button_27 = new JButton("MC");
		button_27.setFocusPainted(false);
		button_27.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_27, "2, 4, fill, fill");

		JButton button_26 = new JButton("MR");
		button_26.setFocusPainted(false);
		button_26.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_26, "4, 4, fill, fill");

		JButton button_25 = new JButton("MS");
		button_25.setFocusPainted(false);
		button_25.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_25, "6, 4, fill, fill");

		JButton button_24 = new JButton("M+");
		button_24.setFocusPainted(false);
		button_24.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_24, "8, 4, fill, fill");

		JButton button_23 = new JButton("M-");
		button_23.setFocusPainted(false);
		button_23.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_23, "10, 4, fill, fill");

		JButton button_22 = new JButton("<--");
		button_22.setFocusPainted(false);
		button_22.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_22, "2, 6, fill, fill");

		JButton button_21 = new JButton("CE");
		button_21.setFocusPainted(false);
		button_21.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_21, "4, 6, fill, fill");

		JButton button_20 = new JButton("C");
		button_20.setFocusPainted(false);
		button_20.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_20, "6, 6, fill, fill");

		JButton button_19 = new JButton("+-");
		button_19.setFocusPainted(false);
		button_19.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_19, "8, 6, fill, fill");

		JButton button_18 = new JButton("?");
		button_18.setFocusPainted(false);
		button_18.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_18, "10, 6, fill, fill");

		JButton button_17 = new JButton("7");
		button_17.setFocusPainted(false);
		button_17.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_17, "2, 8, fill, fill");

		JButton button_16 = new JButton("8");
		button_16.setFocusPainted(false);
		button_16.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_16, "4, 8, fill, fill");

		JButton button_15 = new JButton("9");
		button_15.setFocusPainted(false);
		button_15.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_15, "6, 8, fill, fill");

		JButton button_14 = new JButton("/");
		button_14.setFocusPainted(false);
		button_14.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_14, "8, 8, fill, fill");

		JButton button_13 = new JButton("%");
		button_13.setFocusPainted(false);
		button_13.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_13, "10, 8, fill, fill");

		JButton button_12 = new JButton("4");
		button_12.setFocusPainted(false);
		button_12.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_12, "2, 10, fill, fill");

		JButton button_11 = new JButton("5");
		button_11.setFocusPainted(false);
		button_11.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_11, "4, 10, fill, fill");

		JButton button_10 = new JButton("6");
		button_10.setFocusPainted(false);
		button_10.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_10, "6, 10, fill, fill");

		JButton button_9 = new JButton("*");
		button_9.setFocusPainted(false);
		button_9.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_9, "8, 10, fill, fill");

		JButton button_8 = new JButton("1/x");
		button_8.setFocusPainted(false);
		button_8.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_8, "10, 10, fill, fill");

		JButton button_7 = new JButton("1");
		button_7.setFocusPainted(false);
		button_7.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_7, "2, 12, fill, fill");

		JButton button_6 = new JButton("2");
		button_6.setFocusPainted(false);
		button_6.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_6, "4, 12, fill, fill");

		JButton button_5 = new JButton("3");
		button_5.setFocusPainted(false);
		button_5.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_5, "6, 12, fill, fill");

		JButton button_4 = new JButton("-");
		button_4.setFocusPainted(false);
		button_4.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_4, "8, 12, fill, fill");

		JButton button_3 = new JButton("=");
		button_3.setFocusPainted(false);
		button_3.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_3, "10, 12, 1, 3, fill, fill");

		JButton button_2 = new JButton("0");
		button_2.setFocusPainted(false);
		button_2.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button_2, "2, 14, 3, 1, fill, fill");

		JButton button_1 = new JButton(",");
		button_1.setMargin(new Insets(0, 0, 0, 0));
		button_1.setFocusPainted(false);
		windowContent.add(button_1, "6, 14, fill, fill");

		JButton button = new JButton("+");
		button.setMargin(new Insets(0, 0, 0, 0));
		windowContent.add(button, "8, 14, fill, fill");
		
		// חאהא¸ל נאחלונ ט הוכאול פנויל גטהטלûל
		frame.pack();
		frame.setVisible(true);
		
		
		button.addActionListener(cEngine);
		button_3.addActionListener(cEngine);
		button_6.addActionListener(cEngine);
		button_7.addActionListener(cEngine);
	}
	
}
