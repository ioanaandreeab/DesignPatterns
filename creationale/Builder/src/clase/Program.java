package clase;

import builder_v1.BuilderRezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// varianta 1
		BuilderRezervare builderRezervare_v1 = new BuilderRezervare();
		builderRezervare_v1.setAsezareLaGeam(true).setDecorareaMesei(false).setMuzicaPersonalizata(true).setGenMuzica("protomanele").setScauneErgonomice(true);
		Rezervare rezervare1 = builderRezervare_v1.build();
		System.out.println(rezervare1.toString());
		
		// varianta 2
		builder_v2.BuilderRezervare builderRezervare_v2 = new builder_v2.BuilderRezervare();
		builderRezervare_v2.setAsezareLaGeam(false).setDecorareaMesei(true).setMuzicaPersonalizata(true).setGenMuzica("tehno").setScauneErgonomice(true);
		System.out.println(builderRezervare_v2.build().toString());
	}

}
