package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<Comanda> comenzi;
	
	public Operator() {
		this.comenzi = new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda comanda) {
		if(comanda!=null) {
			comenzi.add(comanda);
		}
	}
	
	public void executaComanda() {
		if(comenzi.size() > 0) {
			comenzi.get(0).executaComanda();
			comenzi.remove(0);
		}
	}
	
	public void executaComenzi() {
		for(Comanda comanda : comenzi) {
			comanda.executaComanda();
		}
		comenzi.removeAll(comenzi);
	}
}
