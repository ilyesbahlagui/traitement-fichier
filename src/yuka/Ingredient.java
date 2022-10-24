package yuka;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
	 private String nom;

	
	
	
	public Ingredient(String nom) {
		this.nom = nom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return ""+ nom ;
	}




	 
	 
}
