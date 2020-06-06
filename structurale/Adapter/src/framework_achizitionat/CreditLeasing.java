package framework_achizitionat;

public class CreditLeasing {
	private float pretProdus;
	private int nrLuni;
	
	public CreditLeasing(float pretProdus, int nrLuni) {
		super();
		this.pretProdus = pretProdus;
		this.nrLuni = nrLuni;
	}
	
	public void achizitionareLeasing() {
		System.out.println("A fost achizitionat produsul la pretul de "+ this.pretProdus);
	}
	
	public float calculRataLunara() {
		return this.pretProdus/this.nrLuni;
	}
}
