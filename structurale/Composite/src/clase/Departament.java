package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IComposite{
	private String nume;
	private List<Nod> noduri;
	
	
	
	public Departament(String nume) {
		super();
		this.nume = nume;
		this.noduri = new ArrayList<Nod>();
	}
	
	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Departamentul: "+this.nume + " contine:");
		for(Nod nod: noduri) {
			nod.descriere();
		}
	}
	
	@Override
	public void adaugaNod(Nod nod) {
		// TODO Auto-generated method stub
		noduri.add(nod);
	}
	
	@Override
	public void stergeNod(Nod nod) {
		// TODO Auto-generated method stub
		noduri.remove(nod);
	}
	
	@Override
	public Nod getNod(int pozitie) {
		// TODO Auto-generated method stub
		if (pozitie >=0 && pozitie < noduri.size()) {
			return noduri.get(pozitie);
		}
		return null;
	}
	
	
}
