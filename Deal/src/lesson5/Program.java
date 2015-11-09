package lesson5;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import lesson4.Product.pr;

public class Program {

	private Collection<Deal> deal = new LinkedList<Deal>();
	private List<Product> allProduct = new LinkedList<Product>();

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
		return foto;
	}

	private BotinkiPr inBotinki() {
		BotinkiPr boti = new BotinkiPr();
		boti.setTitle(kbString("��� ����� >> "));
		boti.setColor(kbString("���� >> "));
		boti.setSize(kbDouble("������ >> "));
		boti.setPrice(kbDouble("��������� >> "));
		return boti;
	}

	private Deal inDeal() {
		Map<Product, Integer> products = new HashMap<Product, Integer>();

		do {
			products.put(qwestionPr(), inQuontProduct());
		} while ((int) kbDouble("������ ��� �������: " + "\n" + "�� ������� 1"
				+ "\n" + "��� ������� 2") == 1);
		Deal deal = new Deal(inputSaler(), inputBayer(), products);
		return deal;
	}

	private Product saveProduct(Product pr) {
		allProduct.add(pr);
		return pr;
	}

	private Product qwestionPr() {
		if ((int) kbDouble("������ ����� ������� ��� �������? " + "\n"
				+ "����� ������� 1" + "\n" + "������� ������� 2") == 1) {
			return inProduct();
		}
		System.out.println("������ ���������: ");
		for (Product pr : allProduct) {

			System.out.println(allProduct.indexOf(pr) + " - " + pr.getTitle()
					+ " : " + pr.getPrice());

		}
		return allProduct.get((int) kbDouble("�������� �����"));
	}

	private Product inProduct() {

		try {
			switch (pr.valueOf(kbString(
					"����� ������� ������? Foto ��� Botinki").intern())) {
			case Foto:
				return saveProduct(inFoto());

			case Botinki:
				return saveProduct(inBotinki());

			}
		} catch (IllegalArgumentException e) {
			System.out.println("������ �������� ���, ������� �����");
		}
		return inProduct();
	}

	private int inQuontProduct() {
		int quont = (int) kbDouble("����� ���-�� ?");
		return quont;
	}

	private void input() {
		do {
			deal.add(inDeal());
		} while ((int) kbDouble("������ ��� ������? " + "\n" + "�� ������� 1"
				+ "\n" + "��� ������� 2") == 1);

	}

	private void output() {
		for (Deal deal : deal) {
			System.out
					.println("=================================================================================");
			System.out.println("������ ��: " + deal.getDate() + " ");
			System.out.println("��������: " + deal.getSalerName() + " ����� : "
					+ deal.getSalerO().getAddres() + " ");
			System.out.print(deal.getSalerO().getKeys(0) + " : "
					+ deal.getSalerO().getValues(0) + " || ");
			System.out.println(deal.getSalerO().getKeys(1) + " : "
					+ deal.getSalerO().getValues(1) + " ");
			System.out.println("����������: " + deal.getBayerName()
					+ " ����� : " + deal.getBayerO().getAddres());
			System.out.print(deal.getBayerO().getKeys(0) + " : "
					+ deal.getBayerO().getValues(0) + " || ");
			System.out.println(deal.getBayerO().getKeys(1) + " : "
					+ deal.getBayerO().getValues(1) + " ");
			System.out.println("������ ������: ");
			System.out
					.println("--------------------------------------------------------------------");
			for (Entry<Product, Integer> prod : deal.getProducts()) {
				System.out.println("������������: " + prod.getKey().getTitle()
						+ " ����: " + prod.getKey().getPrice() + " ���-��: "
						+ prod.getValue() + " ���������: "
						+ prod.getKey().getPrice() * prod.getValue());
			}
			System.out
					.println("--------------------------------------------------------------------");
			System.out.println("����� ������: " + deal.getSum());
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
