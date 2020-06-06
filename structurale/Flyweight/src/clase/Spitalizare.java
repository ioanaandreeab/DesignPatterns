package clase;

public class Spitalizare {
	private int nrSalon;
	private int nrPat;
	private int zileSpitalizare;
	
	public Spitalizare(int nrSalon, int nrPat, int zileSpitalizare) {
		super();
		this.nrSalon = nrSalon;
		this.nrPat = nrPat;
		this.zileSpitalizare = zileSpitalizare;
	}
	
	public int getNrSalon() {
		return nrSalon;
	}
	public void setNrSalon(int nrSalon) {
		this.nrSalon = nrSalon;
	}
	public int getNrPat() {
		return nrPat;
	}
	public void setNrPat(int nrPat) {
		this.nrPat = nrPat;
	}
	public int getZileSpitalizare() {
		return zileSpitalizare;
	}
	public void setZileSpitalizare(int zileSpitalizare) {
		this.zileSpitalizare = zileSpitalizare;
	}
	@Override
	public String toString() {
		return "Spitalizare [nrSalon=" + nrSalon + ", nrPat=" + nrPat + ", zileSpitalizare=" + zileSpitalizare + "]";
	}
	
	
}
