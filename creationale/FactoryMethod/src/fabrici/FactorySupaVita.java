package fabrici;

import clase.Supa;
import clase.SupaVita;

public class FactorySupaVita implements FactorySupa{

	@Override
	public Supa creareSupa(float pret) {
		// TODO Auto-generated method stub
		return new SupaVita(pret);
	}

}
