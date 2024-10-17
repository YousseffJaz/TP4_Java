package TP4;

public class Entreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie[] tabSalarie=new Salarie[5];
		tabSalarie[0]=new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1]=new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2]=new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3]=new Employe(87698,"Aymen ",2003,19,5);
		tabSalarie[4]=new Employe(12345,"Khaled",2008,7,4);
		System.out.println("******************************** Liste des Employés*****************************");
		for(int i=0;i<5;i++) {
			if(tabSalarie[i] instanceof Employe) {
				tabSalarie[i].Affiche();
			}
		}
		
		System.out.println("\n********************************** Liste des Vendeurs ***************************");
		for(int i=0;i<5;i++) {
			if(tabSalarie[i] instanceof Vendeur) {
				tabSalarie[i].Affiche();
			}
		}
		Salarie ancien= tabSalarie[0];
		for(int i=0;i<5;i++) {
			if(ancien.getRecrutement() > tabSalarie[i].getRecrutement()) {
				ancien=tabSalarie[i];
			}
		}
		System.out.println("\n******************* Nom du salarié le plus ancien dans l'entreprise ********************\n");
		System.out.println("                      Nom:"+ancien.nom+" recruté en l’an "+ancien.recrutement);
		System.out.println("*****************************************************************************");
		
		Salarie plusGrandSalaire = null ;		
		for(int i=0;i<5;i++) {
			if(tabSalarie[i] instanceof Vendeur) {
				if(plusGrandSalaire == null) {
					plusGrandSalaire =	tabSalarie[i];
				}
				else if(plusGrandSalaire.Salaire()<tabSalarie[i].Salaire()) {
					plusGrandSalaire=tabSalarie[i];
				}
			}
		}
		System.out.println("\n****************** Matricule du vendeur disposant du plus grand salaire ****************\n");
		System.out.println("                  Matricule="+plusGrandSalaire.matricule+" de salaire="+plusGrandSalaire.Salaire()+"Dt");

		
		
		
	}	
	
	

}
