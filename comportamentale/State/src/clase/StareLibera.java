package clase;

public class StareLibera implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		// TODO Auto-generated method stub
		masa.setStare(this);
	}

	@Override
	public void printStare(int nrMasa) {
		// TODO Auto-generated method stub
		System.out.println("Masa "+nrMasa+" este libera");
	}
	
}
