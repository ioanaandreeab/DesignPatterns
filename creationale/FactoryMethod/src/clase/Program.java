package clase;

import fabrici.FactorySupa;
import fabrici.FactorySupaLegume;
import fabrici.FactorySupaPui;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorySupa factorySupaLegume = new FactorySupaLegume();
		Supa supaLegume = factorySupaLegume.creareSupa(20);
		supaLegume.comandaSupa();
		
		FactorySupa factorySupaPui = new FactorySupaPui();
		Supa supaPui = factorySupaPui.creareSupa(25);
		supaPui.comandaSupa();
	}

}
