package reflection.sampleproxy;

/**
 * @author : JOHNNGUYEN
 * @since : 7/16/2023, Sun
 **/
public class MyRealClass {

    public void executeA(String message) {
        System.out.println("executeA " + message);
    }

    public void executeB(String message) {
        System.out.println("executeB " + message);
    }
}
