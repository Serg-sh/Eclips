package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionWriteButton implements ActionListener{
	Window parent;
	FileWriter fw;
	private final String space6 = "      ";
	private final String bigRazdel = "==========================================================\n";
	private final String smlRazrel = "----------------------------------------------------------\n";
			
	
	
	public ActionWriteButton(Window parent) {
		super();
		this.parent = parent;
	}
	
	private File createFileLog(){
		String fName = "src\\communalka\\" + parent.textFieldDate_1.getText()+".txt";
		if (new File(fName).exists()){
			return new File(fName);
		}else{
			File file = new File(fName);
			try {
				file.createNewFile();
			} catch (IOException e) {
				JOptionPane.showConfirmDialog(null, "���� �� ������","Error", JOptionPane.PLAIN_MESSAGE);
			}
			return file;
		}
		
	}
	
	private void writeToFile (File file){
		try {
			fw = new FileWriter(file, true);
			fw.write(bigRazdel);
			String date = parent.textFieldDate_1.getText();
			String m1 = (String) parent.comboBox_1.getSelectedItem();
			String m2 = "";
			String m3 = "";
			if (parent.comboBox_2.isVisible()) m2 = (String) parent.comboBox_2.getSelectedItem();
			if (parent.comboBox_3.isVisible()) m3 = (String) parent.comboBox_3.getSelectedItem();
			fw.write(date + "   " + m1 + "   " + m2 + "   " + m3 +'\n');
//			�������������
			fw.write(smlRazrel);
			fw.write(parent.label_2.getText()+'\n');
			fw.write(space6 + "����� �� 100 ���" + " - " + parent.tarif("������������� �� 100 ���") +" ���."+'\n');
			fw.write(space6 + "����� ����� 100 ���" + " - " + parent.tarif("������������� ����� 100 ���") +" ���."+'\n');
			fw.write(space6 +"�����������: " + parent.textFieldElRazn.getText() + " ���" + "  �� ����� " + parent.textFieldElSum.getText() + " ���."+'\n');
			
//			����
			fw.write(smlRazrel);
			fw.write(parent.lblNewLabel_4.getText()+'\n');
			fw.write(space6 + "�����: " + " - " + parent.tarif("����") +" ���/���.�"+'\n');
			fw.write(space6 + "�����������: " + parent.textFieldWaterRaz.getText() + " ���.�" + "  �� ����� " + parent.textFieldWaterSum.getText() + " ���."+'\n');
//			��������
			fw.write(smlRazrel);
			fw.write(parent.label_6.getText()+'\n');
			fw.write(space6 + "�����: " + " - " + parent.tarif("�������� 1 ��.�") +" ���."+'\n');
			fw.write(space6 + "�����: " + " - " + parent.textFieldRoomSum.getText() +" ���"+'\n');
//			���
			fw.write(smlRazrel);
			fw.write(parent.label_7.getText()+'\n');
			fw.write(space6 + "�����: " + " - " + parent.tarif("���") +" ���/���.�"+'\n');
			fw.write(space6 + "�����: " + " - " + parent.textFieldGazSum.getText() +" ���"+'\n');
//			�����
			fw.write(smlRazrel);
			fw.write(parent.label_9.getText()+'\n');
			fw.write(space6 + "�����: " + " - " + parent.tarif("�����") +" ���/�"+'\n');
			fw.write(space6 + "�����: " + " - " + parent.textFieldMusorSum.getText() +" ���"+'\n');
//			����
			fw.write(smlRazrel);
			fw.write(parent.label_11.getText()+'\n');
			fw.write(space6 + "�����: " + " - " + parent.tarif("����") +" ���/�"+'\n');
			fw.write(space6 + "�����: " + " - " + parent.textFieldLiftSum.getText() +" ���"+'\n');
//			���������
			if (parent.chckbx_3.isSelected()) fw.write(smlRazrel);
			if (parent.chckbx_3.isSelected()) fw.write(parent.label_13.getText()+'\n');
			if (parent.textFieldOtoplTarif_1.isEditable()){
				String month1 = parent.textFieldOtoplMonth_1.getText();
				String tarif1 = parent.textFieldOtoplTarif_1.getText();
				String sum1 = parent.textFieldOtoplSum1.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " ���/��.�  " + sum1 + " ��� �� �����" + '\n');
			}
			if (parent.textFieldOtoplTarif_2.isEditable()){
				String month1 = parent.textFieldOtoplMonth_2.getText();
				String tarif1 = parent.textFieldOtoplTarif_2.getText();
				String sum1 = parent.textFieldOtoplSum2.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " ���/��.�  " + sum1 + " ��� �� �����" + '\n');
			}
			if (parent.textFieldOtoplTarif_3.isEditable()){
				String month1 = parent.textFieldOtoplMonth_3.getText();
				String tarif1 = parent.textFieldOtoplTarif_3.getText();
				String sum1 = parent.textFieldOtoplSum3.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " ���/��.�  " + sum1 + " ��� �� �����" + '\n');
			}
			if (parent.chckbx_3.isSelected()){
				fw.write(space6 + space6 + space6 + " �����: " + parent.textFieldOtoplSum.getText() + " ���"+ '\n');
			}
//			����
			if (parent.checkBox_4.isSelected()) {
				fw.write(smlRazrel);
				fw.write(parent.label_18.getText() + ":" + '\n');
				fw.write(space6 + parent.comboBox_5.getSelectedItem() + " - " + parent.textFieldDolg.getText() + " ���."
						+ '\n');
				fw.write('\n');
				if (!parent.textAreaDolg.getText().equals("")) {
					fw.write(parent.label_19.getText() + '\n');
					fw.write('\n');
					fw.write(parent.textAreaDolg.getText() + '\n');
				}
			}
//			�������
			if (!parent.textAreaNotes.getText().equals("")){
				fw.write(smlRazrel);
				fw.write(parent.label_16.getText() + ":" + '\n');
				fw.write('\n');
				fw.write(parent.textAreaNotes.getText()+ '\n');
			}
//			�����
			fw.write(smlRazrel);
			fw.write(space6 + space6 + space6 + space6 + space6 + "����� � ������: " + parent.textFieldSumRez.getText() + " ���"+ '\n');
			fw.write(bigRazdel);
			
		} catch (FileNotFoundException e1) {
			JOptionPane.showConfirmDialog(null, "���� ������� �� ������","File not found", JOptionPane.PLAIN_MESSAGE);
		}catch (IOException e2) {
			JOptionPane.showConfirmDialog(null, "���� ������� �� ������","File not found", JOptionPane.PLAIN_MESSAGE);
		}finally{
			try {
				fw.close();
			} catch (IOException e1) {
				JOptionPane.showConfirmDialog(null, "���� �� ��������","Error", JOptionPane.PLAIN_MESSAGE);
			}
		}
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		writeToFile(createFileLog());
		JOptionPane.showConfirmDialog(null, "������ ������� ��������","���� ������", JOptionPane.PLAIN_MESSAGE);
	}

}
