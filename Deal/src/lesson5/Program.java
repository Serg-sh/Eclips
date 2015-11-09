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
		Party saler = new Party(kbString("Название вродавца >> "),
				kbString("Адрес продавца >> "));
		saler.setKeys(inKeys());
		saler.setValues(inValues());
		return saler;
	}

	private Party inputBayer() {
		Party bayer = new Party(kbString("Название покупателя >> "),
				kbString("Адрес покупателя >> "));
		bayer.setKeys(inKeys());
		bayer.setValues(inValues());
		return bayer;
	}

	private FotoPr inFoto() {
		FotoPr foto = new FotoPr();
		foto.setTitle(kbString("Название фотоаппарата >> "));
		foto.setMegapx(kbDouble("Кол-во мегапикселей >> "));
		foto.setDigital((int) kbDouble("Фотоаппарат цифровой ? >> "));
		foto.setPrice(kbDouble("Стоимость >> "));
		return foto;
	}

	private BotinkiPr inBotinki() {
		BotinkiPr boti = new BotinkiPr();
		boti.setTitle(kbString("Тип обуви >> "));
		boti.setColor(kbString("Цвет >> "));
		boti.setSize(kbDouble("Размер >> "));
		boti.setPrice(kbDouble("Стоимость >> "));
		return boti;
	}

	private Deal inDeal() {
		Map<Product, Integer> products = new HashMap<Product, Integer>();

		do {
			products.put(qwestionPr(), inQuontProduct());
		} while ((int) kbDouble("Ввести еще продукт: " + "\n" + "Да нажмите 1"
				+ "\n" + "Нет нажмите 2") == 1);
		Deal deal = new Deal(inputSaler(), inputBayer(), products);
		return deal;
	}

	private Product saveProduct(Product pr) {
		allProduct.add(pr);
		return pr;
	}

	private Product qwestionPr() {
		if ((int) kbDouble("Ввести новый продукт или выбрать? " + "\n"
				+ "Новый нажмите 1" + "\n" + "Выбрать нажмите 2") == 1) {
			return inProduct();
		}
		System.out.println("Список продуктов: ");
		for (Product pr : allProduct) {

			System.out.println(allProduct.indexOf(pr) + " - " + pr.getTitle()
					+ " : " + pr.getPrice());

		}
		return allProduct.get((int) kbDouble("Сделайте выбор"));
	}

	private Product inProduct() {

		try {
			switch (pr.valueOf(kbString(
					"Какой продукт внести? Foto или Botinki").intern())) {
			case Foto:
				return saveProduct(inFoto());

			case Botinki:
				return saveProduct(inBotinki());

			}
		} catch (IllegalArgumentException e) {
			System.out.println("такого продукта нет, введите новый");
		}
		return inProduct();
	}

	private int inQuontProduct() {
		int quont = (int) kbDouble("Какое кол-во ?");
		return quont;
	}

	private void input() {
		do {
			deal.add(inDeal());
		} while ((int) kbDouble("Ввести еще сделку? " + "\n" + "Да нажмите 1"
				+ "\n" + "Нет нажмите 2") == 1);

	}

	private void output() {
		for (Deal deal : deal) {
			System.out
					.println("=================================================================================");
			System.out.println("Сделка от: " + deal.getDate() + " ");
			System.out.println("Продавец: " + deal.getSalerName() + " Адрес : "
					+ deal.getSalerO().getAddres() + " ");
			System.out.print(deal.getSalerO().getKeys(0) + " : "
					+ deal.getSalerO().getValues(0) + " || ");
			System.out.println(deal.getSalerO().getKeys(1) + " : "
					+ deal.getSalerO().getValues(1) + " ");
			System.out.println("Покупатель: " + deal.getBayerName()
					+ " Адрес : " + deal.getBayerO().getAddres());
			System.out.print(deal.getBayerO().getKeys(0) + " : "
					+ deal.getBayerO().getValues(0) + " || ");
			System.out.println(deal.getBayerO().getKeys(1) + " : "
					+ deal.getBayerO().getValues(1) + " ");
			System.out.println("Товары сделки: ");
			System.out
					.println("--------------------------------------------------------------------");
			for (Entry<Product, Integer> prod : deal.getProducts()) {
				System.out.println("Наименование: " + prod.getKey().getTitle()
						+ " Цена: " + prod.getKey().getPrice() + " Кол-во: "
						+ prod.getValue() + " Стоимость: "
						+ prod.getKey().getPrice() * prod.getValue());
			}
			System.out
					.println("--------------------------------------------------------------------");
			System.out.println("Сумма сделки: " + deal.getSum());
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
