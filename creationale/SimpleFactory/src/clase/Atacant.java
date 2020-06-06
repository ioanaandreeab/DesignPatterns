package clase;

public class Atacant implements Jucator {
	private String nume;
	
	@Override
	public String getNumeJucator() {
		// TODO Auto-generated method stub
		return this.nume;
	}
	
	public Atacant(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String getPozitie() {
		// TODO Auto-generated method stub
		return "Atacant";
	}

}
