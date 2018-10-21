package DesignPattern.structural;

public class MainAdapter {
    public static void main(String args[]) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "hello.mp3");
        audioPlayer.play("MP4", "takeme.mp4");
        audioPlayer.play("VCL", "goodby.vcl");
        audioPlayer.play("PDF", "hello.pdf");
    }
}
