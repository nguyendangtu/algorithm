package DesignPattern.structural.adapter;

/***
 *  the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the
 *  decorator pattern) that allows the interface of an existing class to be used as another interface
 */
public class MainAdapter {
    public static void main(String args[]) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "hello.mp3");
        audioPlayer.play("MP4", "takeme.mp4");
        audioPlayer.play("VCL", "goodby.vcl");
        audioPlayer.play("PDF", "hello.pdf");
    }
}
