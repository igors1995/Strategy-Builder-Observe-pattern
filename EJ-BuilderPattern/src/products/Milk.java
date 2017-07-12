package products;

//JavaBeans patern (bad choice)

public class Milk {
	private String Name;
	private double serving;
	private int proteins;
	private int sugar;
	private int fat;

	public Milk(String name, double serving) {
		super();
		Name = name;
		this.serving = serving;
	}

	public void setProteins(int proteins) {
		this.proteins = proteins;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return "Milk [Name=" + Name + ", serving=" + serving + ", proteins=" + proteins + ", sugar=" + sugar + ", fat="
				+ fat + "]";
	}

}
