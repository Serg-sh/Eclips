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
		char[] arrPassword = chArrPassLength();
		
		condition(arrPassword);
		
		
		parrent.textFieldPass.setText(String.valueOf(arrPassword));
	}
	
	private char genRandom (char[] arr){
		int i = (int)((Math.random()) * arr.length);
		return arr[i];
	}
	
//	Определяет длину массива символов пароля
	private char[] chArrPassLength() {
		char[] arrPass = new char[(int) parrent.spinner.getValue()];
		return arrPass;
	}
	
//	условие по умолчанию шаблон
	private void condition(char[] chArr) {
		for (int i = 0; i < 1; i++){
			chArr[i] = genRandom(SymbolForPass.ENCAPLETT);
		}
		for (int i = 1; i < 4; i++){
			chArr[i] = genRandom(SymbolForPass.ENLETT);
		}
		for (int i = 4; i < chArr.length; i++){
			chArr[i] = genRandom(SymbolForPass.NUM);
		}
		
	}

}
