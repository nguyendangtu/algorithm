package DesignPattern.builder;

public abstract class Buger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
