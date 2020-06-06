package clase;

public class Masa {
	private Stare stare;
	private int nrMasa;
	
	public Stare getStare() {
		return stare;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}
	
	public void rezervaMasa() {
		if (stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			stare.printStare(nrMasa);
		} else {
			System.out.println("Masa "+ nrMasa + " nu poate fi rezervata");
		}
	}
	
	public void ocupaMasa() {
		if (!(stare instanceof StareOcupata)) {
			this.stare = new StareOcupata();
			stare.printStare(nrMasa);
		} else {
			System.out.println("Masa "+ nrMasa + " nu poate fi ocupata");
		}
	}
	
	public void elibereazaMasa() {
		if (!(stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			stare.printStare(nrMasa);
		} else {
			System.out.println("Masa "+ nrMasa + " este deja libera");
		}
	}
}
