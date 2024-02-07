package web;

public class CreditModel {
	
	private double taux;
	private int duree;
	private double montant;
	private double resultat;
	
	
	public CreditModel() {
		super();
	}
	
	public CreditModel(double montant, double taux, int duree) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
	}
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	
}
