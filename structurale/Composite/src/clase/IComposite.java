package clase;

public interface IComposite extends Nod{
	public void adaugaNod(Nod nod);
	public void stergeNod(Nod nod);
	public Nod getNod(int pozitie);
}
