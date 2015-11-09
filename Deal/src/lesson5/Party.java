package lesson5;

public class Party {
	public Party(String name, String addres) {
		super();
		this.name = name;
		this.addres = addres;
	}

	private String name;
	private String addres;
	private String[] keys;
	private String[] values;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setKeys(String[] keys) {
		this.keys = keys;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public String getKeys(int i) {
		return keys[i];
	}

	public String getValues(int i) {
		return values[i];
	}

}
