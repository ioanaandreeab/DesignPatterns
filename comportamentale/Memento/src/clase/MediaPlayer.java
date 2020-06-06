package clase;

//Originator
public class MediaPlayer {
	private String songName;
	private String timer;
	
	//creareMemento
	
	public MediaPlayerMemento exit() {
		System.out.println("Player is closing");
		return new MediaPlayerMemento(this.songName, this.timer);
	}
	
	//set Memento
	public void start(MediaPlayerMemento memento) {
		if(memento!=null) {
			this.songName = memento.getSongName();
			this.timer = memento.getTimer();
		} else {
			System.out.println("Player started.");
		}
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}
	
}
