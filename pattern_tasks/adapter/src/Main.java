public class Main {
  public static void main(String[] args) {
      OldMp3Player oldPlayer = new OldMp3Player();
      MusicPlayer player = new Mp3PlayerAdapter(oldPlayer);
      
      player.play("song.mp3");
  }
}
