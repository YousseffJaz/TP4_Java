package TP4;

public class Employe extends Salarie {
	private double Hsupp;
	private double PHsupp;
	
	public Employe(int matricule, String nom, int recrutement,double Hsupp, double PHsupp) {
		super(matricule,nom,recrutement);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
	}

	public double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}

	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	public void Affiche() {
		super.Affiche();
		System.out.println("nombre d'heures supplémentaires="+this.Hsupp+" et prix par heure supplémentaire="+this.PHsupp);
	}
	public double Salaire() {
		return (super.Salaire()+(this.Hsupp*this.PHsupp));
	}
	


}
