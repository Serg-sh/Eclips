package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;



public class CalculatorEngine implements ActionListener {
	Calculator parent;	
	double rez = 0;
	double tmp = 0;

	public CalculatorEngine(Calculator parent) {
		this.parent = parent;
	}
	public boolean checkChar (char ch){
		try {
		double i = Double.parseDouble(String.valueOf(ch));
		} catch (Exception e){
			return false;
		}
		return true;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton = (JButton) e.getSource();
		String clcBut = clickedButton.getText();
		String tmpStr = parent.formattedTextField.getText();
		parent.formattedTextField.setText(tmpStr + clcBut);
			
		if (clcBut.equals("=")){
			char[] chNum = tmpStr.toCharArray();
			Map<Integer, Character> map = new HashMap<Integer, Character>();
			for (int i =0; i<chNum.length;i++){
				map.put(i, chNum[i]);
			}
			
		}
}
		
	

}
