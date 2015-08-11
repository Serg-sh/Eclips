package lesson5;

public abstract class Product {
	public static final int DEF_DISCONT = 10;
	private String title;
	private double price;

	public static enum pr {
		Foto, Botinki
	};

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
