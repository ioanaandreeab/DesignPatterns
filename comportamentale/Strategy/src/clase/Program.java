package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Popescu");
		client.setModPlata(new PlataCard());
		client.plateste(20);
		client.setModPlata(new PlataCash());
		client.plateste(50);
	}

}
