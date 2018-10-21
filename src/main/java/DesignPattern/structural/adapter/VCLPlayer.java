package DesignPattern.structural.adapter;

public class VCLPlayer implements AdvantageMediaPlayer {
    @Override
    public void playVCL(String file) {
        System.out.println("Play VCL on file " + file);
    }

    @Override
    public void playMP4(String file) {
        //do nothing
    }
}
