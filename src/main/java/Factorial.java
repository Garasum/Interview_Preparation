/**
 * Created by orest.harasym on 7/9/2018.
 */
public class Factorial {

    public static void main(String[] args) {
        int i, fact = 1;
        //5! = 5*4*3*2*1 = 120
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.println("i = " + i + ", factorial = " + fact);
        }

    }
}
