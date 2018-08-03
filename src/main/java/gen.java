/**
 * Created by orest.harasym on 7/2/2018.
 */
public class gen {


}

class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}

class Test {

    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue = value1.getValue();

        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello World");
        System.out.println(value2);

        // TODO: Type mismatch: cannot convert from String to Integer
        //Integer intValue2 = value2.getValue();
        String stringValue = value2.getValue();


    }
}

class Pair<T1, T2> {
    T1 object1;
    T2 object2;

    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }
}

class Test2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(6, " April");
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}

// Diamond syntax
class Test3 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, " Diamond syntax");
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}