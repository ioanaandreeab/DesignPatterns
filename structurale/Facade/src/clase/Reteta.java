package clase;

public class Reteta {
	private int codMedicament;
	private int nrCard;
	
	public Reteta(int codMedicament, int nrCard) {
		super();
		this.codMedicament = codMedicament;
		this.nrCard = nrCard;
	}

	public int getCodMedicament() {
		return codMedicament;
	}

	public void setCodMedicament(int codMedicament) {
		this.codMedicament = codMedicament;
	}

	public int getNrCard() {
		return nrCard;
	}

	public void setNrCard(int nrCard) {
		this.nrCard = nrCard;
	}
	
	
	
}
