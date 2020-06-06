package fabrici;

import clase.Supa;
import clase.SupaLegume;

public class FactorySupaLegume implements FactorySupa{

	@Override
	public Supa creareSupa(float pret) {
		return new SupaLegume(pret);
	}

}
