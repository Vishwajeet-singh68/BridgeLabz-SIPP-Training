package MusicPlayer;

public class MusicPlayer {
	public static void main(String args[]) {
		Queue playlist=new LinkedList();
		playlist.addFirst("MI Gente");
		playlist.addLast("Burn it up");
		playlist.addFirst("move your body");
		playlist.addFirst("jai bholenaath");
//		playlist.display();
		System.out.println(playlist.currentSong());
	}
}
