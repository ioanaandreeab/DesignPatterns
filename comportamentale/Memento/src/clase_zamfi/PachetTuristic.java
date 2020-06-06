package clase_zamfi;

public class PachetTuristic {
	private double pret;

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public PachetTuristic(double pret) {
		super();
		this.pret = pret;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PachetTuristic [pret="+ pret+"]";
	}
	
	public MementoPachetTuristic salvareMemento() {
		return new MementoPachetTuristic(this.pret);
	}
	
	public void undoToMemento(MementoPachetTuristic memento) {
		this.pret = memento.getPretPachet();
	}
	
}
