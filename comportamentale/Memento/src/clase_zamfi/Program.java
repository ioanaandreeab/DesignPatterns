package clase_zamfi;

public class Program {
	
	public static void main(String[] args) {
		PachetTuristic pachet = new PachetTuristic(20);
		ManagerPacheteTuristice managerPachete = new ManagerPacheteTuristice();
		
		System.out.println(pachet.toString());
		managerPachete.adaugaMemento(pachet.salvareMemento());
		
		pachet.setPret(50);
		System.out.println(pachet.getPret());
		managerPachete.adaugaMemento(pachet.salvareMemento());
		
		pachet.setPret(100);
		managerPachete.adaugaMemento(pachet.salvareMemento());
		pachet.setPret(500);
		
		try {
			pachet.undoToMemento(managerPachete.getLastMemento());
			System.out.println(pachet.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
