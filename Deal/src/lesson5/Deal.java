package lesson5;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Deal {
	public Deal(Party saler, Party bayer, Map<Product, Integer> products) {
		this.saler = saler;
		this.bayer = bayer;
		this.products = products;
	}

	private Date date = new Date();
	private Party saler;
	private Party bayer;
	private Map<Product, Integer> products;
	public static final int DEF_DISCOUNT = 10;

	public Date getDate() {
		return date;
	}

	public String getSalerName() {
		return saler.getName();
	}

	public Party getSalerO() {
		return saler;
	}

	public String getBayerName() {
		return bayer.getName();
	}

	public Party getBayerO() {
		return bayer;
	}

	public Set<Entry<Product, Integer>> getProducts() {
		Set<Entry<Product, Integer>> entry = products.entrySet();
		return entry;
	}

	protected int calcDiscount(Entry<Product, Integer> en) {
		if (en.getValue() > 5) {
			return DEF_DISCOUNT;
		}
		return 0;

	}

	protected double getSum() {
		double sum = 0;
		Set<Entry<Product, Integer>> entry = products.entrySet();
		for (Entry<Product, Integer> en : entry) {
			sum += en.getKey().getPrice()
					* en.getValue()
					- (en.getKey().getPrice() * en.getValue()
							* calcDiscount(en) / 100);
		}
		return sum;
	}

}
