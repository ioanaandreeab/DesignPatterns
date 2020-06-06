package clase;

public class MediaPlayerMemento {
	private String songName; //stare
	private String timer;
	
	public String getSongName() {
		return songName;
	}
	public String getTimer() {
		return timer;
	}
	
	public MediaPlayerMemento(String songName, String timer) {
		super();
		this.songName = songName;
		this.timer = timer;
	}
	
}
