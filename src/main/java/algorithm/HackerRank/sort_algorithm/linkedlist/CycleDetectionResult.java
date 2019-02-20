package algorithm.HackerRank.sort_algorithm.linkedlist;

public class CycleDetectionResult<T> {
    boolean cycleExists;
    Node<T> node;

    public CycleDetectionResult(boolean cycleExists, Node<T> node) {
        super();
        this.cycleExists = cycleExists;
        this.node = node;
    }
}
