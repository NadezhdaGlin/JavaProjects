public class Mp3PlayerAdapter implements MusicPlayer {
  private OldMp3Player oldPlayer;

  public Mp3PlayerAdapter(OldMp3Player oldPlayer) {
    this.oldPlayer = oldPlayer;
  }

  public void play(String fileName) {
    oldPlayer.playMp3(fileName);
  }
}
