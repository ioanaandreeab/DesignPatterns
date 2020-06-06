package builder_v1;

import clase.Rezervare;

public class BuilderRezervare implements Builder {
	private Rezervare rezervare;
	
	public BuilderRezervare() {
		super();
		this.rezervare = new Rezervare();
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	
	public BuilderRezervare setAsezareLaGeam(boolean asezareLaGeam) {
		this.rezervare.setAsezareLaGeam(asezareLaGeam);
		return this;
	}
	
	public BuilderRezervare setScauneErgonomice(boolean scauneErgonomice) {
		this.rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}
	
	public BuilderRezervare setDecorareaMesei(boolean decorareaMesei) {
		this.rezervare.setDecorareaMesei(decorareaMesei);
		return this;
	}
	
	public BuilderRezervare setMuzicaPersonalizata(boolean muzicaPersonalizata) {
		this.rezervare.setMuzicaPersonalizata(muzicaPersonalizata);
		return this;
	}
	
	public BuilderRezervare setGenMuzica (String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	

}
