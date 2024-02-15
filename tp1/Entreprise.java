package tp1;

public class Entreprise {
	private int nbrEmp;
    private int capital;
    private String nom;
    private String mission;
	public Entreprise(int nbrEmp, int capital, String nom, String mission)  {
		this.nbrEmp = nbrEmp;
        this.capital = capital;
        this.nom = nom;
        this.mission = mission;
	}
	 public String mission() throws SecretMissionException {
	        if (this.mission.equals("Secret")) {
	            throw new SecretMissionException("Mission secrète!");
	        }
	        return mission;
	    }

	    public int capital() throws NonProfitException {
	        if (this.capital == 0) {
	            throw new NonProfitException("Entreprise sans profit");
	        }
	        return capital;
	    }
	    public int nbrEmp() {
	    	return nbrEmp;
	    }
	    public String nom() {
	    	return nom;
	    }

}
