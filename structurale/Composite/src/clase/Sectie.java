package clase;

public class Sectie implements Nod {
	private String nume;
	
	public Sectie(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectia: "+this.nume);
	}
	
}
