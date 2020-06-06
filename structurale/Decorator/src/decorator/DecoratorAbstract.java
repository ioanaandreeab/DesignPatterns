package decorator;

import clase.IBonDeCasa;

public abstract class DecoratorAbstract implements IBonDeCasa{
	private IBonDeCasa bonDeCasa;

	public DecoratorAbstract(IBonDeCasa bonDeCasa) {
		super();
		this.bonDeCasa = bonDeCasa;
	}
	
	@Override
	public void printBon() {
		// TODO Auto-generated method stub
		bonDeCasa.printBon();
	}
	
	public abstract void printareFelicitare();
}
