package TP4;

public class Salarie {
	
	protected int matricule ;
	protected String nom;
	protected int recrutement ;
	
	public Salarie(int matricule, String nom, int recrutement){
		this.matricule=matricule;
		this.nom=nom;
		this.recrutement=recrutement;	
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom(){
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public int getRecrutement() {
		return recrutement ;
	}
	public void setRecrutement(int recrutement) {
		this.recrutement=recrutement;
	}

	public void Affiche() {
		System.out.print("matricule=" + matricule + ", nom=" + nom + ", recrutement=" + recrutement+" "); 
	}
	public double Salaire() {
		if(this.recrutement<2005) {
			return 400;
		}else {
			return 280;
		}
	}

	
	

}

