package john_java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MyFunctionalInterfaceSample {
    public static void main(String args[]) {
        //BiFunction
        BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };

        System.out.println(biFunction.apply(2.0, 3.0));

        //BiPredicate
        BiPredicate<MyFunctionalInterfaceSample, MyFunctionalInterfaceSample> isEqual = MyFunctionalInterfaceSample::equals;
        boolean res = isEqual.test(new MyFunctionalInterfaceSample(), new MyFunctionalInterfaceSample());
        System.out.println(res);

        //


    }


}


