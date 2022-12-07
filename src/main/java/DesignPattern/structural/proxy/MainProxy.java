package DesignPattern.structural.proxy;

/***
 * is a class functioning as an interface to something else
 */
public class MainProxy {
    public static void main(String args[]) {
        ProxyImage proxyImage = new ProxyImage("FileNameXXX.dat");
        proxyImage.display();
        proxyImage.display();

    }
}
