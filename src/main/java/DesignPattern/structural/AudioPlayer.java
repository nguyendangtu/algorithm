package DesignPattern.structural;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String file) {
        switch (type) {
            case MediaPlayer.MP3:
                System.out.println("Play MP3 on file " + file);
                break;
            case AdvantageMediaPlayer.MP4:
            case AdvantageMediaPlayer.VCL:
                mediaAdapter = new MediaAdapter(type);
                mediaAdapter.play(type, file);
                break;
            default:
                System.out.println("Invalid media. " + type + " format not supported");
                break;
        }
    }

}
