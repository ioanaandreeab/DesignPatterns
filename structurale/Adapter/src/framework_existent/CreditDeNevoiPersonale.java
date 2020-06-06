package framework_existent;

public class CreditDeNevoiPersonale implements Credit {
	private float sumaCredit;
	private int nrLuni;
	
	public CreditDeNevoiPersonale(float sumaCredit, int nrLuni) {
		super();
		this.sumaCredit = sumaCredit;
		this.nrLuni = nrLuni;
	}

	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		System.out.println("A fost oferit creditul cu suma de " + this.sumaCredit + " pentru " + this.nrLuni + " luni");
	}

	@Override
	public float rataLunara() {
		// TODO Auto-generated method stub
		return this.sumaCredit/this.nrLuni;
	}

}
