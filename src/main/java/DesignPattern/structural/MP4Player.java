package DesignPattern.structural;

public class MP4Player implements AdvantageMediaPlayer {
    @Override
    public void playVCL(String file) {
        //do nothing
    }

    @Override
    public void playMP4(String file) {
        System.out.println("Play MP4 on file " + file);
    }
}
