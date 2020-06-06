package adapter_obiecte;

import framework_achizitionat.CreditLeasing;
import framework_existent.Credit;

public class AdapterObiecte implements Credit{
	// obiect din clasa achizitionata
	private CreditLeasing creditLeasing;
	
	public AdapterObiecte(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		this.creditLeasing.achizitionareLeasing();
	}

	@Override
	public float rataLunara() {
		// TODO Auto-generated method stub
		return this.creditLeasing.calculRataLunara();
	}
	
}
