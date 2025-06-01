import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        getOddsFromOneToN(3);
        System.out.println(containsKeyword("Hola colegonesbreak my heart"));
    }

    public static int[] getOddsFromOneToN(int n){
        int currentNum = 0;
        int[] aux = new int[n];
        for (int i = 0; i < aux.length; i++) {
            if ((i+1) % 2 != 0){
                aux[currentNum] = i+1;
                currentNum ++;
            }
        }
        int[] result =  new int[currentNum];
        for (int i = 0; i < result.length ; i++) {
            result[i] = aux[i];
            System.out.println(result[i]);

        }

        return result;
    }

    public static boolean containsKeyword(String input){
        Set<String> keywords = new HashSet<>(Set.of(
                "abstract", "continue", "for", "new", "switch",
                "assert", "default", "goto", "package", "synchronized",
                "boolean", "do", "if", "private", "this",
                "break", "double", "implements", "protected", "throw",
                "byte", "else", "import", "public", "throws",
                "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try",
                "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile",
                "const", "float", "native", "super", "while"
        ));


        String[] inputWords = input.trim().split(" ");
        for (String inputWord : inputWords) {
            if (keywords.contains(inputWord)){
                return true;
            }
        }
        return false;
    }
}
