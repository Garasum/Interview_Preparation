package CodeWars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by orest.harasym on 8/2/2018.
 */
public class HighestAndLowest {
}

class Kata {
    public static String HighAndLow(String numbers) {

        String[] n = numbers.split(" ");

        Integer min = Integer.parseInt(n[0]);
        Integer max = Integer.parseInt(n[0]);


        for (String s : n) {
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
            if (Integer.parseInt(s) < min) {
                min = Integer.parseInt(s);
            }
        }

        return String.format("%s %s", max, min);
    }
}

class Tests {
    @Test
    public void Test1() {
        assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}


// Best Solution
//import java.util.Arrays;
//
//public class Kata {
//    public static String HighAndLow(String numbers) {
//
//        int min = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .min()
//                .getAsInt();
//
//        int max = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .max()
//                .getAsInt();
//
//        return String.format("%d %d", max, min);
//    }
//}