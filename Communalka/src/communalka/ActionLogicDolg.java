package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionLogicDolg implements ActionListener{
	private Window parent;

	public ActionLogicDolg(Window parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (parent.textFieldDolg.hasFocus()) {
				if (Double.parseDouble(parent.textFieldDolg.getText()) < 0) throw new ExceptionMinus();
				parent.sumRezCalc();
			}
		} catch (ExceptionMinus err) {
			JOptionPane.showConfirmDialog(null, err.error4, "�������� ���� ������", JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException err) {
			JOptionPane.showConfirmDialog(null, "� ���� \"����\" ���������� ������� �����", "�������� ���� ������",
					JOptionPane.PLAIN_MESSAGE);
		}

	}
	

}
