package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlyweightFactory fabrica = new FlyweightFactory();
		IPacient pacient = fabrica.getPacient("Ioana", "0725346821", "Strada lalelelor");
		Spitalizare spitalizare = new Spitalizare(20, 12, 4);
		pacient.descrierePacient(spitalizare);
		Spitalizare spitalizare2 = new Spitalizare(34, 45, 14);
		pacient.descrierePacient(spitalizare2);
	}

}
