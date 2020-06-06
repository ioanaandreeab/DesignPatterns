package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departament depFinanciar = new Departament("Financiar");
		Departament depHr = new Departament("HR");
		
		Sectie sectieConta = new Sectie("Contabilitate");
		Sectie sectieSalarii = new Sectie("Salarii");
		
		depFinanciar.adaugaNod(depHr);
		// aici asta e subdepartament
		depFinanciar.adaugaNod(sectieSalarii);
		depFinanciar.adaugaNod(sectieConta);
		
		depFinanciar.descriere();
	}

}
