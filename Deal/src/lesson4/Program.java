package lesson4;

import java.util.Scanner;

import lesson4.Product.pr;

public class Program {

	final Deal[] MAX_DEAL = new Deal[2];

	private String kbString(String message) {
		System.out.print(message + ": ");
		String rez = new Scanner(System.in).next();
		return rez;
	}

	private double kbDouble(String message) {
		System.out.print(message + ": ");
		double rez = new Scanner(System.in).nextDouble();
		return rez;
	}

	private String[] inKeys() {
		String[] keys = { kbString("Key 1 >> "), kbString("Key 2 >> ") };
		return keys;
	}

	private String[] inValues() {
		String[] values = { kbString("Values 1 >> "), kbString("Values 2 >> ") };
		return values;
	}

	private Party inputSaler() {
		Party saler = new Party(kbString("�������� �������� >> "),
				kbString("����� �������� >> "));
		saler.setKeys(inKeys());
		saler.setValues(inValues());
		return saler;
	}

	private Party inputBayer() {
		Party bayer = new Party(kbString("�������� ���������� >> "),
				kbString("����� ���������� >> "));
		bayer.setKeys(inKeys());
		bayer.setValues(inValues());
		return bayer;
	}

	private FotoPr inFoto() {
		FotoPr foto = new FotoPr();
		foto.setTitle(kbString("�������� ������������ >> "));
		foto.setMegapx(kbDouble("���-�� ������������ >> "));
		foto.setDigital((int) kbDouble("����������� �������� ? >> "));
		foto.setPrice(kbDouble("��������� >> "));
		foto.setQuont((int) kbDouble("���-�� >> "));
		return foto;
	}

	private BotinkiPr inBotinki() {
		BotinkiPr boti = new BotinkiPr();
		boti.setTitle(kbString("��� ����� >> "));
		boti.setColor(kbString("���� >> "));
		boti.setSize(kbDouble("������ >> "));
		boti.setPrice(kbDouble("��������� >> "));
		boti.setQuont((int) kbDouble("���-�� >> "));
		return boti;
	}

	private Deal inDeal() {
		Product[] products = { inProduct(), inProduct() };
		Deal deal = new Deal(inputSaler(), inputBayer(), products);
		return deal;
	}

	private Product inProduct() {

		try {
			switch (pr.valueOf(kbString(
					"����� ������� ������? Foto ��� Botinki").intern())) {
			case Foto:
				return inFoto();

			case Botinki:
				return inBotinki();

			}
		} catch (IllegalArgumentException e) {
			System.out.println("������ �������� ���, ������� �����");
		}
		return inProduct();
	}

	private void input() {
		MAX_DEAL[0] = inDeal();
		MAX_DEAL[1] = inDeal();
	}

	private void output() {
		for (Deal deal : MAX_DEAL) {
			System.out
					.println("=================================================================================");
			System.out.println("������ ��: " + deal.getDate() + " ");
			System.out.println("��������: " + deal.getSaler() + " ����� : "
					+ deal.getSalerOb().getAddres() + " ");
			System.out.print(deal.getSalerOb().getKeys(0) + " "
					+ deal.getSalerOb().getValues(0) + " ");
			System.out.println(deal.getSalerOb().getKeys(1) + " "
					+ deal.getSalerOb().getValues(1) + " ");
			System.out.println("����������: " + deal.getBayer() + " ����� : "
					+ deal.getBayerOb().getAddres() + " ");
			System.out.print(deal.getBayerOb().getKeys(0) + " "
					+ deal.getBayerOb().getValues(0) + " ");
			System.out.println(deal.getBayerOb().getKeys(1) + " "
					+ deal.getBayerOb().getValues(1) + " ");
			System.out.println("������ ������: ");
			System.out
					.println("--------------------------------------------------------------------");
			for (Product prod : deal.getProducts()) {
				System.out.println("������������: " + prod.getTitle()
						+ " ����: " + prod.getPrice() + " ���-��: "
						+ prod.getQuont() + " ���������: " + prod.getCost()
						+ " ������: " + prod.calcDiscont() + "%");
			}
			System.out.println("����� ������: " + deal.getSum());
			System.out
					.println("--------------------------------------------------------------------");
			System.out
					.println("=================================================================================");
		}
	}

	private void allActions() {
		input();
		output();
	}

	public static void main(String[] args) {
		new Program().allActions();
	}
}
