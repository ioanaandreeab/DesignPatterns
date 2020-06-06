package clase;

public abstract class Notificator {
	private Notificator urmatorulNotificator;

	public Notificator getUrmatorulNotificator() {
		return urmatorulNotificator;
	}

	public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
		this.urmatorulNotificator = urmatorulNotificator;
	}
	
	public abstract void notifica(Client client, String mesaj);
}
