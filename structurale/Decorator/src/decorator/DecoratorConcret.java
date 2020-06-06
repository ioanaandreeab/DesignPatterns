package decorator;

import clase.IBonDeCasa;

public class DecoratorConcret extends DecoratorAbstract{

	public DecoratorConcret(IBonDeCasa bonDeCasa) {
		super(bonDeCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printareFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("La multi ani!");
	}
	
}
