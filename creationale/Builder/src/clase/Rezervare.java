package clase;

public class Rezervare {
	private boolean asezareLaGeam;
	private boolean scauneErgonomice;
	private boolean decorareaMesei;
	private boolean muzicaPersonalizata;
	private String genMuzica;
	public boolean isAsezareLaGeam() {
		return asezareLaGeam;
	}
	public void setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
	}
	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}
	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}
	public boolean isDecorareaMesei() {
		return decorareaMesei;
	}
	public void setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}
	public boolean isMuzicaPersonalizata() {
		return muzicaPersonalizata;
	}
	public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
		this.muzicaPersonalizata = muzicaPersonalizata;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei,
			boolean muzicaPersonalizata, String genMuzica) {
		super();
		this.asezareLaGeam = asezareLaGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareaMesei = decorareaMesei;
		this.muzicaPersonalizata = muzicaPersonalizata;
		this.genMuzica = genMuzica;
	}
	
	public Rezervare() {
		this.asezareLaGeam = false;
		this.scauneErgonomice = false;
		this.decorareaMesei = false;
		this.muzicaPersonalizata = false;
		this.genMuzica = null;
	}
	
	@Override
	public String toString() {
		return "Rezervare [asezareLaGeam=" + asezareLaGeam + ", scauneErgonomice=" + scauneErgonomice
				+ ", decorareaMesei=" + decorareaMesei + ", muzicaPersonalizata=" + muzicaPersonalizata + ", genMuzica="
				+ genMuzica + "]";
	}
	
	
	
}
