package TP4;

public class Vendeur extends Salarie{
	private double vente;
	private double purcentage;
	
	public Vendeur( int matricule, String nom, int recrutement,double vente, double pourcentage) {
		super(matricule,nom,recrutement);
		this.vente=vente;
		this.purcentage=pourcentage;
	}

	public double getVente() {
		return vente;
	}

	public void setVente(double vente) {
		this.vente = vente;
	}

	public double getPurcentage() {
		return purcentage;
	}

	public void setPurcentage(double purcentage) {
		this.purcentage = purcentage;
	}
	public void Affiche() {
		super.Affiche();
		System.out.println("total des ventes par mois (Dinars)="+this.vente+" et pourcentage sur les ventes:"+this.purcentage+"%");
	}
	public double Salaire() {
		return (super.Salaire()+(this.vente*this.purcentage));
	}
	

}
