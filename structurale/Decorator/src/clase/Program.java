package clase;

import decorator.DecoratorConcret;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonDeCasa bon = new BonDeCasa(2,100);
		bon.printBon();
		
		DecoratorConcret bonDecorat = new DecoratorConcret(bon);
		bonDecorat.printareFelicitare();
	}

}
