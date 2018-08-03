package ChapterOne;

/**
 * Created by orest.harasym on 7/31/2018.
 */
public class Ex1 {
}

class Example {
    public int i;
    public char z;

}

class Test {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println("int default init : " + ex.i);
        System.out.println("char default init : " + ex.z);
    }
}