package lesson3;

import java.util.Scanner;

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

	public static void main(String[] args) {
		new Program().allActions();
	}

	private void allActions() {
		input();
		System.out.println("=======================");
		outpun();

	}

	private void input() {
		for (int j = 0; j < MAX_DEAL.length; j++) {
			Party sal = new Party();
			Party bay = new Party();
			sal.setName(kbString("Name of saler "));
			bay.setName(kbString("Name of bayer "));
			final Product[] MAX_PRODUCT = new Product[2];

			for (int i = 0; i < MAX_PRODUCT.length; i++) {
				Product prod = new Product();
				prod.setTitle(kbString("Title of produkt "));
				prod.setPrice(kbDouble("Price of product ($) "));
				prod.setQuont((int) kbDouble("Quontity of product "));
				MAX_PRODUCT[i] = prod;

			}
			Deal deal = new Deal(sal, bay, MAX_PRODUCT);
			MAX_DEAL[j] = deal;

		}

	}

	private void outpun() {
		for (Deal deal : MAX_DEAL) {
			System.out.println("Сделка от: " + deal.getDate());
			System.out.println("Продавец: " + deal.getSaler() + " Покупатель: "
					+ deal.getBayer());
			System.out.println("Товары сделки: ");
			for (Product prod : deal.getProducts()) {
				System.out.println("Наименование: " + prod.getTitle()
						+ " Цена: " + prod.getPrice() + "Кол-во: "
						+ prod.getQuont() + " Стоимость: " + prod.getCost());
			}
			System.out.println("Сумма сделки: " + deal.getSum() + " $");
			System.out.println("===============================");
		}

	}

}
