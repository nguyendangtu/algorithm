package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class Off implements FanState {

    CeilingFan fan;

    public Off(CeilingFan fan, Boolean start) {
        this.fan = fan;
        if (!start) {
            System.out.println("turning off");
        }
    }

    @Override
    public void pullred() {
        High newstate = new High(fan);
        fan.setState(newstate);
    }

    @Override
    public void pullgreen() {
        Low newstate = new Low(fan);
        fan.setState(newstate);
    }
}
