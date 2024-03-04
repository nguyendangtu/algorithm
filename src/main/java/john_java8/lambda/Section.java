package lecture9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {

    /***
     * Create a method
     *  Stream<String> streamSection(Stream<String> stream, int m, int n) which extracts a
     * substream from the input stream stream consisting of all elements from position m to position n,
     * inclusive; you must use only Stream operations to do this. You can assume 0 <= m <= n.
     * @param stream
     * @param m
     * @param n
     * @return
     */
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        // Implement the code
        if (stream == null) return null;
        return stream.skip(m).limit(n - m + 1);
    }

    public static void main(String[] args) {
        // Make three calls for the streamSection() method with different inputs
        // use nextStream() method to supply the Stream input as a first argument in streamSection() method
        Stream<String> sub1 = streamSection(nextStream(), 0, 2);
        System.out.println("sub1 stream from 0 to 2 = " + sub1.collect(Collectors.joining(",")));

        Stream<String> sub2 = streamSection(nextStream(), 2, 4);
        System.out.println("sub2 stream from 2 to 4 = " + sub2.collect(Collectors.joining(",")));

        Stream<String> sub3 = streamSection(nextStream(), 4, 7);
        System.out.println("sub3 stream from 4 to 7 = " + sub3.collect(Collectors.joining(",")));

    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
}
