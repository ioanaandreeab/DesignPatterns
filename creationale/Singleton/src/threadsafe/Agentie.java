package threadsafe;

public class Agentie {
	private String numeAgentie;
	private float capital;
	private int nrAngajati;
	
	private static Agentie instanta = null;

	private Agentie(String numeAgentie, float capital, int nrAngajati) {
		super();
		this.numeAgentie = numeAgentie;
		this.capital = capital;
		this.nrAngajati = nrAngajati;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public static synchronized Agentie getInstanta(String numeAgentie, float capital, int nrAngajati) {
		if (instanta == null) {
			instanta = new Agentie(numeAgentie, capital, nrAngajati);
		}
		return instanta;
	}
	
	// daca se apeleaza getInstanta fara param se apeleaza getInstanta cu param nuli
	public static synchronized Agentie getInstanta() {
		return getInstanta(null,0,0);
	}

	@Override
	public String toString() {
		return "Agentie [numeAgentie=" + numeAgentie + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
	}
	
}
