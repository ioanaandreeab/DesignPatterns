package clase;

public abstract class Supa {
	private float pret;
	
	public abstract void comandaSupa();
	

	public Supa(float pret) {
		super();
		this.pret = pret;
	}



	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}
	
}
