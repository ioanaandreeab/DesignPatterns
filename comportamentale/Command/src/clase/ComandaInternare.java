package clase;

public class ComandaInternare implements Comanda{
	private Medic medic;
	private String numePacient;
	
	public ComandaInternare(Medic medic, String numePacient) {
		super();
		this.medic = medic;
		this.numePacient = numePacient;
	}

	@Override
	public void executaComanda() {
		// TODO Auto-generated method stub
		medic.internare(numePacient);
	}
	
	
}
