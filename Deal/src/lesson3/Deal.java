package lesson3;

import java.util.Date;

public class Deal {
	public Deal(Party saler, Party bayer, Product[] products) {
		this.saler = saler;
		this.bayer = bayer;
		this.products = products;
	}

	private Date date = new Date();
	private Party saler;
	private Party bayer;
	private Product[] products;

	public Date getDate() {
		return date;
	}

	public String getSaler() {
		return saler.getName();
	}

	public String getBayer() {
		return bayer.getName();
	}

	public Product[] getProducts() {
		return products;
	}

	public double getSum() {
		double sum = 0;
		for (Product pr : products) {
			sum += pr.getCost();
		}
		return sum;
	}

}
