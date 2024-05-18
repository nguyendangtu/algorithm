package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class High implements FanState {
    CeilingFan fan;

    public High(CeilingFan fan) {
        this.fan = fan;
        System.out.println("high speed");
    }

    @Override
    public void pullgreen() {
        Off newstate = new Off(fan, false);
        fan.setState(newstate);
    }

    @Override
    public void pullred() {
        Medium newstate = new Medium(fan);
        fan.setState(newstate);
    }
}
