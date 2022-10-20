package yuka;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Stockk {
	private List<Produit> ville = new ArrayList<Produit>();

	public Stockk() throws IOException{
		this.getListProduit();
		
	}
	public void getListProduit() throws IOException {
		System.out.println("je suis la ");
		Path pathFile = Paths.get("C:\\work-space-java\\traitement-fichier\\src\\yuka\\open-food-facts.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		for (int i = 0; i < 1; i++) {
			String[] lineProduit = lines.get(i).split("@");
			System.out.println( lineProduit.length);
			System.out.println(lineProduit[0]+" // "+lineProduit[4]+"//"+lineProduit[28]);
			
			Categorie categorie=new Categorie(lineProduit[0]);
			Marque marque=new Marque(lineProduit[1]);
			Allergene allergene=new Allergene(lineProduit[28]);
//			Marque marque=new Marque(lineProduit[1]);
//			Marque marque=new Marque(lineProduit[1]);
			
			
		}
		System.out.println();
		
	}
	public List<Produit> getVille() {
		return ville;
	}

	public void setVille(List<Produit> ville) {
		this.ville = ville;
	}
}
