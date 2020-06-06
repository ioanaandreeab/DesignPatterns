package clase;

public class NotificatorSMS extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		// TODO Auto-generated method stub
		if(client.getNr_telefon() !=null) {
			System.out.println(client.getNume()+ " ai un SMS cu mesajul "+mesaj);
		}
		else super.getUrmatorulNotificator().notifica(client, mesaj);
	}

}
