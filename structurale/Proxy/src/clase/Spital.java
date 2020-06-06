package clase;

public class Spital implements ISpital{
	
	public void internare(Persoana pacient) {
		System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
	}
}
