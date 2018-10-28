package DesignPattern.structural.proxy;

public class MainProxy {
    public static void main(String args[]) {
        ProxyImage proxyImage = new ProxyImage("FileNameXXX.dat");
        proxyImage.display();
        proxyImage.display();

    }
}
