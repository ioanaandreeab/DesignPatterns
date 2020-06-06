package clase;

public class ClientFidel implements Observer{
	private String nume;
	
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptioneazaMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(this.nume + ", ai primit mesajul: "+mesaj);
	}

}
