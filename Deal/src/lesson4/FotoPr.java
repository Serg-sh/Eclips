package lesson4;

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

	protected int calcDiscont() {
		int def = super.calcDiscont();
		if (!digital) {
			def += 20;
		}
		return def;

	}

}
