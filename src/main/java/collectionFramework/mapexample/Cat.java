package collectionFramework.mapexample;

public class Cat {
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return color.length();
    }

    @Override
    public boolean equals(Object object) {
        return (object instanceof Cat && ((Cat) object).color.equalsIgnoreCase(this.color));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " Cat";
    }
}

