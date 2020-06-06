package clase;

public class SupaVita extends Supa {

	public SupaVita(float pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comandaSupa() {
		// TODO Auto-generated method stub
		System.out.println("Supa de vita a fost comandata la pretul de: " + this.getPret());
	}

}
