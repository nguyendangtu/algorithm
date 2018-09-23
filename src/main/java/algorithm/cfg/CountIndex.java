package algorithm.cfg;

public class CountIndex {
    private int count;
    private int index;

    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    public void countIncrement() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

