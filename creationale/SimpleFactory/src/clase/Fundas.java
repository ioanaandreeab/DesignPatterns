package clase;

public class Fundas implements Jucator {
	private String nume;
	
	@Override
	public String getNumeJucator() {
		// TODO Auto-generated method stub
		return this.nume;
	}
	
	public Fundas(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String getPozitie() {
		// TODO Auto-generated method stub
		return "Fundas";
	}

}
