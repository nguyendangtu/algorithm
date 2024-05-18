package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class Medium implements FanState {
    CeilingFan fan;
    public Medium(CeilingFan fan) {
        this.fan=fan;
        System.out.println( "medium speed" );
    }
    public void pullgreen() {
        High newstate = new High(fan);
        fan.setState(newstate);
    }
    public void pullred() {
        Low newstate = new Low(fan);
        fan.setState(newstate);
    }
}
