package CodeWars;

import static org.testng.Assert.assertEquals;

/**
 * Created by orest.harasym on 8/8/2018.
 * https://www.codewars.com/kata/is-this-a-triangle/java
 */
public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}

class TriangleTesterTest {
    public static void main(String[] args) {
        assertEquals(TriangleTester.isTriangle(1, 2, 2), true);
        assertEquals(TriangleTester.isTriangle(7,2,2), false);
    }
}