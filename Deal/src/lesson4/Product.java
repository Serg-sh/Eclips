package lesson4;

public abstract class Product {
	public static final int DEF_DISCONT = 10;
	private String title;
	private double price;
	private int quont;

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

	public double getQuont() {
		return quont;
	}

	public void setQuont(int quont) {
		this.quont = quont;
	}

	public double getCost() {
		return quont * price - (quont * price * calcDiscont() / 100);
	}

	protected int calcDiscont() {
		if (quont > 10) {
			return DEF_DISCONT;
		}
		return 0;
	}

}
