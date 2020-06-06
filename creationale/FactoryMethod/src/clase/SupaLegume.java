package clase;

public class SupaLegume extends Supa {

	public SupaLegume(float pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comandaSupa() {
		// TODO Auto-generated method stub
		System.out.println("Supa de legume a fost comandata la pretul de: " + this.getPret());
	}

}
