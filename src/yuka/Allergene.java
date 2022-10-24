package yuka;

public class Allergene {


	private String nom;
	private int nbProduitApparait;

	public Allergene(String nom) {
		this.nom = nom;
	}
	public Allergene(String nom,int nbProduitApparait) {
		this.nom = nom;
		this.nbProduitApparait = nbProduitApparait;
	}
	
	
	public int getNbProduitApparait() {
		return nbProduitApparait;
	}
	public void setNbProduitApparait(int nbProduitApparait) {
		this.nbProduitApparait = nbProduitApparait;
	}
	@Override
	public String toString() {
		return "" + nom ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
