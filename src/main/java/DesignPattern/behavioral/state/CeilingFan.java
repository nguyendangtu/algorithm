package DesignPattern.behavioral.state;

/**
 * @author : JOHNNGUYEN
 * @since : 3/24/2024, Sun
 **/
public class CeilingFan {
    FanState state;

    public void setState(FanState state) {
        this.state = state;
    }

    public void pullred() {
        state.pullred();
    }

    public void pullgreen() {
        state.pullgreen();
    }

}
