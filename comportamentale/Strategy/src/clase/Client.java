package clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		this.nume = nume;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void plateste(float suma) {
		this.modPlata.realizeazaPlata(suma);
	}
}
