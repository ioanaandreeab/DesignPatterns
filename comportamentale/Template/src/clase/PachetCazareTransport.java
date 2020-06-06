package clase;

public class PachetCazareTransport extends TemplatePachetTuristic {

	public PachetCazareTransport(int codPachet) {
		super(codPachet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cautareCazare(int codPachet) {
		// TODO Auto-generated method stub
		System.out.println("S-a gasit cazare pentru pachetul cu codul "+codPachet);
	}

	@Override
	public void cautareTransport(int codPachet) {
		// TODO Auto-generated method stub
		System.out.println("S-a gasit transport pentru pachetul cu codul "+codPachet);
	}

	@Override
	public void rezervaPachet(int codPachet) {
		// TODO Auto-generated method stub
		System.out.println("S-a rezervat pachetul "+codPachet);
	}

	@Override
	public void platirePachet(int codPachet) {
		// TODO Auto-generated method stub
		System.out.println("S-a platit pachetul "+codPachet);
	}

}
