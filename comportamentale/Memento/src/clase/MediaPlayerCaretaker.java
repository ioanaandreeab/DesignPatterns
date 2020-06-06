package clase;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerCaretaker {
	private List<MediaPlayerMemento> history = new ArrayList<MediaPlayerMemento>();
	
	public void addMemento(MediaPlayerMemento memento) {
		this.history.add(memento);
	}
	
	public MediaPlayerMemento getState(int index) {
		if (index >= 0 && index < this.history.size()) {
			return this.history.get(index);
		} else return null;
	}
	
	public MediaPlayerMemento getLastState() {
		if(this.history.size() > 0) {
			MediaPlayerMemento memento = this.history.get(this.history.size() -1); //extrag ultima stare 
			this.history.remove(this.history.size()-1); //sterg ultima stare din istoric
			return memento;
		} else {
			return null;
		}
	}
}
