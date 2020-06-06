package clase;

public class BonDeCasa implements IBonDeCasa{
	private int nrMedicamente;
	private double totalBon;
	
	public BonDeCasa(int nrMedicamente, double totalBon) {
		super();
		this.nrMedicamente = nrMedicamente;
		this.totalBon = totalBon;
	}

	@Override
	public void printBon() {
		// TODO Auto-generated method stub
		System.out.println("Total bon: "+this.totalBon + " Nr. medicamente: " + this.nrMedicamente);
	}
	
	
}
