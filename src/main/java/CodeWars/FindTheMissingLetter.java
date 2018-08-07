package CodeWars;

import java.util.Arrays;

/**
 * Created by orest.harasym on 8/6/2018.
 * https://www.codewars.com/kata/find-the-missing-letter/train/java
 */
public class FindTheMissingLetter {
    private static char[] alphabetLoverCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static char[] alphabetUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static char findMissingLetter(char[] array) {
        char[] alphabet;
        char[] arrayAlphabet;
        StringBuilder str = new StringBuilder();
        int firstIndex = -1;
        int lastIndex = -1;
        char result = 'a';

        // 0. Check Upper\Lower case
        if (Character.isUpperCase(array[0])) {
            alphabet = alphabetUpperCase;
        } else {
            alphabet = alphabetLoverCase;
        }
        // 1. @array get first\last index
        for (int i = 0; i < alphabet.length; i++) {
            if (array[0] == alphabet[i]) {
                firstIndex = i;
            }
            if (array[array.length - 1] == alphabet[i]) {
                lastIndex = i;
            }
        }
        System.out.println(alphabet);
        System.out.println("firstIndex " + firstIndex);
        System.out.println("lastIndex " + lastIndex);
        System.out.println("Enter String: " + Arrays.toString(array));
        // 2. compare array and alphabet ( use indexes to get substring )
        for (int i = firstIndex; i <= lastIndex; i++) {
            str.append(alphabet[i]);
        }
        arrayAlphabet = str.toString().toCharArray();
        System.out.println("String Alphabet: " + Arrays.toString(arrayAlphabet));
        // 2.1 IF letter from array != letter from alphabet = it's our missing letter
        for (int i = 0; i < array.length; i++) {
            if (array[i] != arrayAlphabet[i]) {
                result = arrayAlphabet[i];
                break;
            }
        }
        System.out.println("Result :" + result);
        return result;
    }
}

class Test {
    public static void main(String[] args) {
            FindTheMissingLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
        FindTheMissingLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'});
    }
}