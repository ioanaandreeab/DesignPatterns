package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reteta reteta = new Reteta(120,75);
		
		System.out.println(FacadeReteta.verificaReteta(reteta));
	}

}
