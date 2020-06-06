package clase;

public class FactoryJucator {
	
	public Jucator createJucator(TipJucator tip, String nume) {
		switch (tip) {
		case PORTAR:
			return new Portar(nume);
		case FUNDAS:
			return new Fundas(nume);
		case ATACANT:
			return new Atacant(nume);
		default:
			return null;
		}
	}
}
