package lesson3;

public class Product {
	private String title;
	private double price;
	private int quont;

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

	public double getQuont() {
		return quont;
	}

	public void setQuont(int quont) {
		this.quont = quont;
	}

	public double getCost() {
		return quont * price;
	}

}
