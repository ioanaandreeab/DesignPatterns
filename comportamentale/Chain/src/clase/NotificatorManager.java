package clase;

public class NotificatorManager extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(client.getNume() + " nu a putut primi mesajul");
	}

}
