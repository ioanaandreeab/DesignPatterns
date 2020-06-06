package clase;

public class FacadeReteta {
	public static String verificaReteta(Reteta retetaClient) {
		if(Depozit.verificareDisponibilitate(retetaClient.getCodMedicament())) {
			if(CasaDeAsigurari.esteAsigurat(retetaClient.getNrCard()) ) {
				return ("Medicamentele pot fi vandute");
			}
			else {
				return ("Clientul nu este asigurat");
			}
		}
		else {
			return ("Medicamentele nu sunt disponibile");
		}
	}

}
