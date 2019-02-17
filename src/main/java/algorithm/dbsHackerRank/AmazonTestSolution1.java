package algorithm.dbsHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class AmazonTestSolution1 {
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries) {
        // WRITE YOUR CODE HERE
        if (numDeliveries > allLocations.size()) return null;
        BiFunction<List<Integer>, List<Integer>, Boolean> biFunction = (a1, a2) -> Math.sqrt(
                a1.get(0) * a1.get(0) + a1.get(1) * a1.get(1)) > Math.sqrt(a2.get(0) * a2.get(0) + a2.get(1) * a2.get(1));

        allLocations.sort((a1, a2) -> biFunction.apply(a1, a2) ? 1 : -1);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numDeliveries; i++) {
            result.add(allLocations.get(i));
        }

        return result;
    }
}
