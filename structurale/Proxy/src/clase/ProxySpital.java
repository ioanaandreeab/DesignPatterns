package clase;

public class ProxySpital implements ISpital{

	private ISpital spital;
	
	public ProxySpital(ISpital spital) {
		super();
		this.spital = spital;
	}

	@Override
	public void internare(Persoana pacient) {
		// TODO Auto-generated method stub
		if(pacient.isAreAsigurare()) {
			this.spital.internare(pacient);
		} else {
			System.out.println("Pacientul "+pacient.getNume()+ " nu are asigurare si nu poate fi internat");
		}
	}
	
}
