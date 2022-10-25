package yuka;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	private Categorie categorie;
	private Marque marque;
	private List<Ingredient> ingredient = new ArrayList<Ingredient>();
	private List<Allergene> allergene = new ArrayList<Allergene>();
	private List<Additif> additif = new ArrayList<Additif>();
	private ScoreNutri nutritions;
	private String nom;
	private double energie;
	private double graisse;
	private double sucres;
	private double fibres;
	private double proteines;
	private double sel;

	public Produit( String nom,Categorie categorie, Marque marque, List<Ingredient> ingredient, List<Allergene> allergene,
			List<Additif> additif, ScoreNutri scoreNutri, double energie, double graisse, double sucres,
			double fibres, double proteines, double sel) {
		
		this.categorie = categorie;
		this.marque = marque;
		this.ingredient = ingredient;
		this.allergene = allergene;
		this.additif = additif;
		this.nutritions = scoreNutri;
		this.energie = energie;
		this.graisse = graisse;
		this.sucres = sucres;
		this.fibres = fibres;
		this.proteines = proteines;
		this.sel = sel;
		this.nom = nom;
	}
	
	

	@Override
	public String toString() {
		return "Produit => " + nom + ", categorie=" + categorie + ", marque=" + marque + ", ingredient=" + ingredient + ", allergene="
				+ allergene + ", additif=" + additif + ", nutritions=" + nutritions +", energie="
				+ energie + ", graisse=" + graisse + ", sucres=" + sucres + ", fibres=" + fibres + ", proteines="
				+ proteines + ", sel=" + sel + "\n";
	}
	



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public List<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public List<Allergene> getAllergene() {
		return allergene;
	}

	public void setAllergene(List<Allergene> allergene) {
		this.allergene = allergene;
	}

	public List<Additif> getAdditif() {
		return additif;
	}

	public void setAdditif(List<Additif> additif) {
		this.additif = additif;
	}

	public ScoreNutri getNutritions() {
		return nutritions;
	}

	public void setNutritions(ScoreNutri nutritions) {
		this.nutritions = nutritions;
	}

	public double getEnergie() {
		return energie;
	}

	public void setEnergie(double energie) {
		this.energie = energie;
	}

	public double getGraisse() {
		return graisse;
	}

	public void setGraisse(double graisse) {
		this.graisse = graisse;
	}

	public double getSucres() {
		return sucres;
	}

	public void setSucres(double sucres) {
		this.sucres = sucres;
	}

	public double getFibres() {
		return fibres;
	}

	public void setFibres(double fibres) {
		this.fibres = fibres;
	}

	public double getProteines() {
		return proteines;
	}

	public void setProteines(double proteines) {
		this.proteines = proteines;
	}

	public double getSel() {
		return sel;
	}

	public void setSel(double sel) {
		this.sel = sel;
	}

}
