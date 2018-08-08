package CodeWars;

import java.text.DecimalFormat;

/**
 * Created by orest.harasym on 8/8/2018.
 * Sum of the first nth term of Series
 */
public class NthSeries {
    public static String seriesSum(int n) {
        //DecimalFormat df = new DecimalFormat("#.##");
        double sum = 0;
        double x = 4;
        if (n == 0) {
            sum = 0;
        }
        if (n == 1) {
            sum = 1;
        }
        if (n == 2) {
            sum = 1.25;
        } else {
            sum = 1 + 1 / x;
            for (int i = 1; i <= n - 2; i++) {
                x += 3;
                sum += 1 / x;
            }
        }
        return String.format("%.2f",sum);
        //return df.format(sum);
        //return String.valueOf(Math.round(sum * 100.0) / 100.0);
    }
}

class NthSeriesTest {
    public static void main(String[] args) {
        System.out.println(NthSeries.seriesSum(5));
        System.out.println(NthSeries.seriesSum(9));
        System.out.println(NthSeries.seriesSum(15));
        System.out.println(NthSeries.seriesSum(62));
        System.out.println(NthSeries.seriesSum(78));
    }
}
