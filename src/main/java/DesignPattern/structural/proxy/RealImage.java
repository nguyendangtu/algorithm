package DesignPattern.structural.proxy;

public class RealImage implements Image {

    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisks();
    }

    @Override
    public void display() {
        System.out.println("Display image " + fileName);
    }

    private void loadFromDisks(){
        System.out.println("Load Image from Disks");
    }
}
