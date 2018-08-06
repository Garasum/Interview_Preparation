package CodeWars;

import java.util.Arrays;

/**
 * Created by orest.harasym on 8/6/2018.
 * https://www.codewars.com/kata/find-the-missing-letter/train/java
 */
public class FindTheMissingLetter {
    private static final char[] alphabetLoverCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] alphabetUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char findMissingLetter(char[] array) {
        char[] alphabet;
        Integer firstIndex;
        Integer lastIndex;
        // 0. Check Upper\Lower case
        boolean isUpperCase = Character.isUpperCase(array[0]);
        if (isUpperCase) {
            alphabet = alphabetUpperCase;
        } else {
            alphabet = alphabetLoverCase;
        }
        // 1. @array get first\last index
        // TODO: Replace with loop http://www.techiedelight.com/find-index-element-array-java/
        firstIndex = Arrays.asList(alphabet).indexOf(array[0]);
        lastIndex = Arrays.asList(alphabet).indexOf(array[array.length]);

        System.out.println(alphabet);
        System.out.println("firstIndex " + firstIndex);
        System.out.println("lastIndex " + lastIndex);
        // 2. compare array and alphabet ( use indexes to get substring )
        // 2.1 IF letter from array != letter from alphabet = it's our missing letter

        return ' ';
    }
}

class Test {
    public static void main(String[] args) {
        FindTheMissingLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
//        FindTheMissingLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'});
    }
}