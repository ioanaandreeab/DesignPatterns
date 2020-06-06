package clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer player = new MediaPlayer();
		MediaPlayerCaretaker careTaker = new MediaPlayerCaretaker();
		
		player.start(careTaker.getLastState());
		
		player.setSongName("Drake - Nonstop");
		player.setTimer("2:13");
		
		careTaker.addMemento(player.exit());
		
		player.start(careTaker.getLastState());
	}

}
