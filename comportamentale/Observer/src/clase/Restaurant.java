package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
	public List<Observer> clientiFideli;
	
	public Restaurant(List<Observer> clientiFideli) {
		super();
		this.clientiFideli = clientiFideli;
	}
	
	public Restaurant() {
		this.clientiFideli = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		// TODO Auto-generated method stub
		clientiFideli.add(observer);
	}

	@Override
	public void notificaObserveri(String mesaj) {
		// TODO Auto-generated method stub
		for (Observer observer:clientiFideli) {
			observer.receptioneazaMesaj(mesaj);
		}
	}

	@Override
	public void eliminaObserver(Observer observer) {
		// TODO Auto-generated method stub
		clientiFideli.remove(observer);
	}
	
	public void ofertaPret() {
		notificaObserveri("S-a introdus o noua oferta de pret");
	}
	
	public void introducereMeniuNou() {
		notificaObserveri("S-a introdus un meniu nou");
	}

}
