package ua.serg.passgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionButtGen implements ActionListener {
	Window parrent;
	int min, max;
	char ch;

	public ActionButtGen(Window parrent) {
		super();
		this.parrent = parrent;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		char[] chArr = new char[(int) parrent.spinner.getValue()];
//		condition();
		for (int i = 0; i < 1; i++){
			chArr[i] = genRandom(65, 90);
		}
		for (int i = 1; i < 4; i++){
			chArr[i] = genRandom(97, 122);
		}
		for (int i = 4; i < chArr.length; i++){
			chArr[i] = genRandom(48, 57);
		}
		
		parrent.textFieldPass.setText(String.valueOf(chArr));
//		min =0;
//		max =0;
	}
	
	private char genRandom (int min, int max){
		
		return (char)(min +(int)((Math.random()) * ((max-min)+1)));
					
	}
	
//	private void condition() {
//		
//		else if (parrent.chckbxNumber.isSelected() & parrent.checkBoxEnLett.isSelected() & parrent.checkBoxEnCapLett.isSelected()){
//			min = 48; 
//			max = 122;
//		}
//	    else if (parrent.checkBoxRuCapLett.isSelected()& parrent.checkBoxRuLett.isSelected()){
//			min = 1040; 
//			max = 1103;
//		}
//	    else if (parrent.checkBoxRuCapLett.isSelected()){
//			min = 1040; 
//			max = 1071;
//		}
//	    else if (parrent.checkBoxRuLett.isSelected()){
//			min = 1072; 
//			max = 1103;
//		}
//	    else if (parrent.checkBoxEnCapLett.isSelected()){
//			min = 65; 
//			max = 90;
//		}
//		else if (parrent.checkBoxEnLett.isSelected()){
//			min = 97; 
//			max = 122;
//		}
//		
//		else if (parrent.chckbxNumber.isSelected()){
//			min = 48; 
//			max = 57;
//			}
//		
//	}

}
