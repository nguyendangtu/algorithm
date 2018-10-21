package DesignPattern.structural;

public class MediaAdapter implements MediaPlayer {

    private AdvantageMediaPlayer advantageMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase(AdvantageMediaPlayer.MP4)) {
            advantageMediaPlayer = new MP4Player();
        } else if (type.equalsIgnoreCase(AdvantageMediaPlayer.VCL)) {
            advantageMediaPlayer = new VCLPlayer();
        }
    }

    @Override
    public void play(String type, String file) {
        if (advantageMediaPlayer != null) {
            switch (type) {
                case AdvantageMediaPlayer.MP4:
                    advantageMediaPlayer.playMP4(file);
                    break;
                case AdvantageMediaPlayer.VCL:
                    advantageMediaPlayer.playVCL(file);
                    break;
                default:
                    break;
            }
        }
    }
}
