package MusicPlayer;

public interface Queue {
	String playNext();
	void addFirst(String song);
	void addLast(String song);
	void removeFirst();
	void removeLast();
	String currentSong();
	void display();
}
