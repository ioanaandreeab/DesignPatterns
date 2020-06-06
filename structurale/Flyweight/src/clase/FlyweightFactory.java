package clase;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, IPacient> pacienti;

	public FlyweightFactory() {
		super();
		this.pacienti = new HashMap<String, IPacient>();
	}
	
	public IPacient getPacient(String nume, String nrTelefon, String adresa) {
		IPacient pacient = pacienti.get(nume);
		if(pacient == null) {
			pacient = new Pacient(nume, nrTelefon, adresa);
			pacienti.put(nume, pacient);
		}
		return pacient;
	}
	
	
}
