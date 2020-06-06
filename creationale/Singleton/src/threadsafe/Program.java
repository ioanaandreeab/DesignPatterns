package threadsafe;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Agentie agentie = Agentie.getInstanta("Disney", 20000, 10);
		agentie.setCapital(250000);
		System.out.println(agentie.toString());
		System.out.println(Agentie.getInstanta().toString());
	}

}
