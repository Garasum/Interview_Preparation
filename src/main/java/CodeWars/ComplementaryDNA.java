package CodeWars;

import static sun.misc.Version.println;

/**
 * Created by orest.harasym on 8/3/2018.
 */
public class ComplementaryDNA {
}

class DnaStrand {
    public static String makeComplement(String dna) {
        String[] rev = dna.split("");
        StringBuilder result = new StringBuilder();
        for (String aRev : rev) {
            if (aRev.equals("A")) {
                result.append("T");
            }
            if (aRev.equals("T")) {
                result.append("A");
            }
            if (aRev.equals("C")) {
                result.append("G");
            }
            if (aRev.equals("G")) {
                result.append("C");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("TTTT"));
        System.out.println(makeComplement("TAACG"));
        System.out.println(makeComplement("CATA"));
    }
}