
public class Main {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "Eminem.mp3");
		audioPlayer.play("mp4", "Eminem.mp4");
		audioPlayer.play("vlc", "Eminem.vlc");
		audioPlayer.play("avi", "Eminem.avi");
	}

}
