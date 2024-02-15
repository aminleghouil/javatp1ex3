package tp1;

public class Entreprises {
	static void tousLesEntreprises(Entreprise[] entreprises) {
        for (Entreprise entreprise : entreprises) {
            try {
                System.out.println("Nom: " + entreprise.nom());
                System.out.println("Mission: " + entreprise.mission());
                System.out.println("Capital: " + entreprise.capital());
                System.out.println("-------------------------");
            } catch (SecretMissionException e ) {
                System.out.println(e.getMessage());
            }
            catch (NonProfitException e ) {
                System.out.println(e.getMessage());
            }
        }
    }


	
	public static void main(String args[]) {
		Entreprise entreprises []= {
				new Entreprise(100, 1000000, "Ooredoo", "Télécommunications"),
                new Entreprise(500, 5000000, "Poulina", "Agroalimentaire"),
                new Entreprise(50, 200000, "Meublatex", "Mobilier"),
                new Entreprise(200, 1000000, "Monoprix", "Distribution"),
                new EntrepriseSecrete(1000, 10000000, "CIA", "Secret"),
                new EntrepriseSansProfit(2000, 0, "CroixRouge", "Aide humanitaire")
		};
		tousLesEntreprises (entreprises);
		
	}

}
