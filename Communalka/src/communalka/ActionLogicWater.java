package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ActionLogicWater implements ActionListener {
	Window parent;
	private Double razPok, newPok, predPok, tarifWater;
	BigDecimal sum;

	public ActionLogicWater(Window parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (parent.textFieldWaterNewPok.hasFocus()) {
				newPok = Double.parseDouble(parent.textFieldWaterNewPok.getText());
				predPok = Double.parseDouble(parent.textFieldWaterPredPok.getText());
				tarifWater = Double.parseDouble(parent.tarif("����"));
				razPok = newPok - predPok;
				if (razPok < 0) throw new ExceptionMinus();
				parent.textFieldWaterRaz.setText(String.valueOf(razPok));
				sum = BigDecimal.valueOf(razPok * tarifWater).setScale(2, BigDecimal.ROUND_HALF_UP);
				parent.textFieldWaterSum.setText(String.valueOf(sum));
				parent.sumRezCalc();
				}
		} catch (ExceptionMinus err) {
			JOptionPane.showConfirmDialog(null, err.error, "�������� ���� ������", JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException err) {
			JOptionPane.showConfirmDialog(null,"� ���� \"���������\" ���������� ������� �����",	"�������� ���� ������", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
