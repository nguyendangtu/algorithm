package collectionFramework;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.function.BiConsumer;

public class EnumsExample {
    public static void main(String args[]) {
        letDoEnumMap();
        letDoEnumSet();
    }

    public enum LEVEL {
        LEVEL1, LEVEL2, LEVEL3, LEVEL4;
    }

    private static void letDoEnumMap() {
        EnumMap<LEVEL, String> levelName = new EnumMap<>(LEVEL.class);
        levelName.put(LEVEL.LEVEL1, "Freshman");
        levelName.put(LEVEL.LEVEL2, "Sophomore");
        levelName.put(LEVEL.LEVEL3, "Junior");
        levelName.put(LEVEL.LEVEL4, "Senior");
        System.out.println(levelName.get(LEVEL.LEVEL4));
        BiConsumer biConsumer = (k, v) -> System.out.println("key=" + k + ", value=" + v);
        levelName.forEach(biConsumer);
    }

    private static void letDoEnumSet() {
        System.out.println("ENUM SET ALL OF");
        EnumSet<LEVEL> levelName = EnumSet.allOf(LEVEL.class);
        levelName.forEach(System.out::println);
        System.out.println("ENUM SET OF");
        EnumSet<LEVEL> leves = EnumSet.of(LEVEL.LEVEL1);
        leves.forEach(System.out::println);
        System.out.println("ENUM SET RANGE");
        EnumSet<LEVEL> levels = EnumSet.range(LEVEL.LEVEL1, LEVEL.LEVEL3);
        levels.forEach(System.out::println);
        System.out.println("ENUM SET COMPLEMENT OF");
        EnumSet<LEVEL> levels1 = EnumSet.complementOf(levels);
        levels1.forEach(System.out::println);


    }

}
