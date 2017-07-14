package products;

//Builder pattern

public class Protein {
	private String name;
	private String sort;
	private int serving = 0;
	private int numberOfServings = 0;
	private int proteinsPerServing = 0;
	private int shugarPerServing = 0;
	private int fatPerServing = 0;

	public static class Builder {

		private String name;
		private String sort;
		private int serving = 0;
		private int numberOfServings = 0;
		private int proteinsPerServing = 0;
		private int shugarPerServing = 0;
		private int fatPerServing = 0;

		public Builder(String name, String sort) {
			this.name = name;
			this.sort = sort;
		}

		public Builder serving(int serving) {
			this.serving = serving;
			return this;
		}

		public Builder numberOfServings(int numberOfServings) {
			this.numberOfServings = numberOfServings;
			return this;
		}

		public Builder proteinsPerServing(int proteinsPerServing) {
			this.proteinsPerServing = proteinsPerServing;
			return this;
		}

		public Builder shugarPerServing(int shugarPerServing) {
			this.shugarPerServing = shugarPerServing;
			return this;
		}

		public Builder sfatPerServing(int fatPerServing) {
			this.fatPerServing = fatPerServing;
			return this;
		}

		public Protein build() {
			return new Protein(this);
		}

	}

	private Protein(Builder builder) {
		name = builder.name;
		sort = builder.sort;
		serving = builder.serving;
		shugarPerServing = builder.shugarPerServing;
		fatPerServing = builder.fatPerServing;
		numberOfServings = builder.numberOfServings;
		proteinsPerServing = builder.proteinsPerServing;
	}
	
	

	@Override
	public String toString() {
		return "Protein [name=" + name + ", sort=" + sort + ", serving=" + serving + ", numberOfServings="
				+ numberOfServings + ", proteinsPerServing=" + proteinsPerServing + ", shugarPerServing="
				+ shugarPerServing + ", fatPerServing=" + fatPerServing + "]";
	}



	public static void main(String[] args) {
		Protein p = new Builder("Iso100", "Whey").serving(40).numberOfServings(100).proteinsPerServing(34).shugarPerServing(3).build();
		System.out.println(p.toString());
		
		
	}
}
