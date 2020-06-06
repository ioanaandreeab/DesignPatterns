package builder_v2;

import clase.Rezervare;

public class BuilderRezervare implements Builder{
	private boolean asezareLaGeam;
	private boolean scauneErgonomice;
	private boolean decorareaMesei;
	private boolean muzicaPersonalizata;
	private String genMuzica;
	
	public BuilderRezervare() {
		super();
		this.asezareLaGeam = false;
		this.scauneErgonomice = false;
		this.decorareaMesei = false;
		this.muzicaPersonalizata = false;
		this.genMuzica = "";
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(asezareLaGeam, scauneErgonomice, decorareaMesei, muzicaPersonalizata, genMuzica);
	}
	
	public BuilderRezervare setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
		return this;
	}
	
	public BuilderRezervare setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
		return this;
	}
	
	public BuilderRezervare setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
		return this;
	}
	
	public BuilderRezervare setMuzicaPersonalizata(boolean muzicaPersonalizata) {
		this.muzicaPersonalizata = muzicaPersonalizata;
		return this;
	}
	
	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
}
