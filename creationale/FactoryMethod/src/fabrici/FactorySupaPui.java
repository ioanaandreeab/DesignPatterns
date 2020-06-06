package fabrici;

import clase.Supa;
import clase.SupaPui;

public class FactorySupaPui implements FactorySupa {

	@Override
	public Supa creareSupa(float pret) {
		// TODO Auto-generated method stub
		return new SupaPui(pret);
	}

}
