package clase;

import adapter_clase.AdapterClase;
import adapter_obiecte.AdapterObiecte;
import framework_achizitionat.CreditLeasing;
import framework_existent.Credit;
import framework_existent.CreditDeNevoiPersonale;

public class Program {
	public static void informatiiCredit(Credit credit) {
		credit.oferaCredit();
		System.out.println("Rata lunara este de "+ credit.rataLunara());
	}
	
	public static void main(String[] args) {
		CreditDeNevoiPersonale creditNevoiPersonale = new CreditDeNevoiPersonale(200,6);
		informatiiCredit(creditNevoiPersonale);
		
		// aici inainte de implementarea adapterului clasa nu poate fi folosita in metoda informatiiCredit
		CreditLeasing creditLeasing = new CreditLeasing(800, 8);
		
		//adapter clase
		AdapterClase adapterCredit = new AdapterClase(800, 8);
		informatiiCredit(adapterCredit);
		
		//adapter obiecte -- aici avem nevoie efectiv de creditul de leasing creat mai sus
		AdapterObiecte adapterObiecte = new AdapterObiecte(creditLeasing);
		informatiiCredit(adapterObiecte);
	}
}
