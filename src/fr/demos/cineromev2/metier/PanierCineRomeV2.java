package fr.demos.cineromev2.metier;

import java.util.ArrayList;


public class PanierCineRomeV2 {
	
	private ArrayList<ArticleCineRomeV2> listPanier;

	public PanierCineRomeV2() {
		listPanier = new ArrayList<ArticleCineRomeV2>();
	}

	public void ajouterArticle(ArticleCineRomeV2 article) throws PanierCineRomeV2Exception {
		if (article.existe()) {
			this.listPanier.add(article);
			article.decremeter();
		} else
			throw new PanierCineRomeV2Exception("Il n'y a plus d'article en stock");
	}

	public void retirerArticle(ArticleCineRomeV2 article) throws PanierCineRomeV2Exception {
		if (!listPanier.isEmpty()) {// pour tester son panier vide il y a la
										// fonction listePanier.isemptu.
			this.listPanier.remove(article);
			article.incrementer();
		} else
			throw new PanierCineRomeV2Exception("Il n'y a rien dans le panier");
	}

	public ArrayList<ArticleCineRomeV2> getListePanier() {
		return listPanier;
	}

	public void setListePanier(ArrayList<ArticleCineRomeV2> listePanier) {
		this.listPanier = listePanier;
	}

	@Override
	public String toString() {
		return "Panier [listePanier=" + listPanier + "]";
	}

}