package products;

//Telescoping pattern(bad choice)

public class Juice {
	private String Name;
	private String fruit;
	private double serving;
	private int proteins;
	private int sugar;
	private int fat;

	public Juice(String name, String fruit, double serving) {
		super();
		Name = name;
		this.fruit = fruit;
		this.serving = serving;
	}

	public Juice(String name, String fruit, double serving, int proteins) {
		super();
		Name = name;
		this.fruit = fruit;
		this.serving = serving;
		this.proteins = proteins;
	}

	public Juice(String name, String fruit, double serving, int proteins, int sugar) {
		super();
		Name = name;
		this.fruit = fruit;
		this.serving = serving;
		this.proteins = proteins;
		this.sugar = sugar;
	}

	public Juice(String name, String fruit, double serving, int proteins, int sugar, int fat) {
		super();
		Name = name;
		this.fruit = fruit;
		this.serving = serving;
		this.proteins = proteins;
		this.sugar = sugar;
		this.fat = fat;
	}

	@Override
	public String toString() {
		return "Juice [Name=" + Name + ", fruit=" + fruit + ", serving=" + serving + ", proteins=" + proteins
				+ ", sugar=" + sugar + ", fat=" + fat + "]";
	}
	
	public static void main(String[] args) {
		Juice appleJuice = new Juice("Hello", "apple", 0.5);
		System.out.println(appleJuice.toString());
	}
}
