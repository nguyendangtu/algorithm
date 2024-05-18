package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class Low implements FanState {
    CeilingFan fan;

    public Low(CeilingFan fan) {
        this.fan = fan;
        System.out.println("low speed");
    }

    @Override
    public void pullred() {
        Off newstate = new Off(fan, false);
        fan.setState(newstate);
    }

    @Override
    public void pullgreen() {
        Medium newstate = new Medium(fan);
        fan.setState(newstate);
    }
}
