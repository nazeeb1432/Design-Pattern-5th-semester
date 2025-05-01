class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;//composition,adaptee

    MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();//initializing adaptee
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
