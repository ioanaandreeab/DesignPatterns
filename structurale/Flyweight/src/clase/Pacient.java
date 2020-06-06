package clase;

public class Pacient implements IPacient {

	private String nume; //cheia de cautare
	private String nrTelefon;
	private String adresa;
	
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresa=" + adresa + "]";
	}

	public String getNume() {
		return nume;
	}

	public Pacient(String nume, String nrTelefon, String adresa) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresa = adresa;
	}

	@Override
	public void descrierePacient(Spitalizare spitalizare) {
		// TODO Auto-generated method stub
		System.out.println("Pacientul " + this.toString() + " este internat in " + spitalizare.toString());
	}

}
