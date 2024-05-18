package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.setState(new Off(fan, true));
        fan.pullgreen();
        fan.pullgreen();
        fan.pullred();
        fan.pullred();
    }
}
