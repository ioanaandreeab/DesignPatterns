package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana pacient1 = new Persoana("Eliza",true);
		Persoana pacient2 = new Persoana("Marian", false);
		
		Spital spital = new Spital();
		ProxySpital proxy = new ProxySpital(spital);
		proxy.internare(pacient2);
		proxy.internare(pacient1);
	}

}
