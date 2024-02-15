package tp1;

public class EntrepriseSansProfit extends Entreprise{

	public EntrepriseSansProfit(int nbrEmp, int capital, String nom, String mission) {
		super(nbrEmp, capital, nom, mission);
		
	}
	@Override
	public int capital() throws NonProfitException{
		throw new NonProfitException("Entreprise sans profit");
	}

}
