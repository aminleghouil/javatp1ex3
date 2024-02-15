package tp1;

public class EntrepriseSecrete extends Entreprise{

	public EntrepriseSecrete(int nbrEmp, int capital, String nom, String mission) {
		super(nbrEmp, capital, nom, mission);
	}
	@Override
    public String mission() throws SecretMissionException {
        throw new SecretMissionException("Mission secrète!");
    }
}
