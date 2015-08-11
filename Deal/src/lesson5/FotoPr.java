package lesson5;

class FotoPr extends Product {
	private double megapx;
	private boolean digital;

	public double getMegapx() {
		return megapx;
	}

	public void setMegapx(double megapx) {
		this.megapx = megapx;
	}

	public boolean getDigital() {
		return digital;
	}

	public void setDigital(int i) {
		int j = 1;
		this.digital = j == i;
	}

}
