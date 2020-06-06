package clase;

public class ComandaTratare implements Comanda {
	private Medic medic;
	private String numePacient;
	
	public ComandaTratare(Medic medic, String numePacient) {
		super();
		this.medic = medic;
		this.numePacient = numePacient;
	}
	
	@Override
	public void executaComanda() {
		// TODO Auto-generated method stub
		medic.tratareImediata(numePacient);
	}
	
	
	
}
