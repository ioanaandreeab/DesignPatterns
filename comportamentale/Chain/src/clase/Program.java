package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notificator notificatorSMS = new NotificatorSMS();
		Notificator notificatorEmail = new NotificatorEmail();
		Notificator notificatorManager = new NotificatorManager();
		
		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		Client client = new Client("Popescu",null,null);
		notificatorSMS.notifica(client, "Mesaj fff important");
	}

}
