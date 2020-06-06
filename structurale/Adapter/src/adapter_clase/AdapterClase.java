package adapter_clase;

import framework_achizitionat.CreditLeasing;
import framework_existent.Credit;

public class AdapterClase extends CreditLeasing implements Credit {

	public AdapterClase(float pretProdus, int nrLuni) {
		super(pretProdus, nrLuni);
		// TODO Auto-generated constructor stub
	}

	// se apeleaza din clasa parinte
	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		super.achizitionareLeasing();
	}

	// se apeleaza din clasa parinte
	@Override
	public float rataLunara() {
		// TODO Auto-generated method stub
		return super.calculRataLunara();
	}
	
}
