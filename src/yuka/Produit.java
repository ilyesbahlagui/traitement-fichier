package yuka;

public class Produit {
	private Categorie categorie;
	private Marque marque;
	private Ingredient ingredient;
	private Allergene allergene;
	private Additif additif;
	private Nutritionnelles nutritions;
	
	
	public Produit(Categorie categorie, Marque marque, Ingredient ingredient, Allergene allergene, Additif additif,
			Nutritionnelles nutritions) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.ingredient = ingredient;
		this.allergene = allergene;
		this.additif = additif;
		this.nutritions = nutritions;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	public Allergene getAllergene() {
		return allergene;
	}
	public void setAllergene(Allergene allergene) {
		this.allergene = allergene;
	}
	public Additif getAdditif() {
		return additif;
	}
	public void setAdditif(Additif additif) {
		this.additif = additif;
	}
	public Nutritionnelles getNutritions() {
		return nutritions;
	}
	public void setNutritions(Nutritionnelles nutritions) {
		this.nutritions = nutritions;
	}
	
	
}
