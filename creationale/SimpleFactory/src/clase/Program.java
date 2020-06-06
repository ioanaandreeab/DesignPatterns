package clase;

public class Program {
	public static void afisareDetalii(Jucator jucator) {
		System.out.println("Nume: "+jucator.getNumeJucator() + " pozitie: "+jucator.getPozitie());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryJucator fabrica = new FactoryJucator();
		Jucator jucator1 = fabrica.createJucator(TipJucator.PORTAR, "Andrei");
		afisareDetalii(jucator1);
		Jucator jucator2 = fabrica.createJucator(TipJucator.ATACANT, "Teodor");
		afisareDetalii(jucator2);
	}

}
