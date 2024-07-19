import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printStringReverse("Hello my nice world");
        System.out.println(isPhoneNumber("84956063602"));
        printSubStringReverse("Hello world!", 1, 4);
        System.out.println(getWordsReverse("Hello my nice world"));
        printWordsReverseInColumn("Hello my nice world");
        System.out.println(maxCharIndex("ddcccabbbb"));
    }

    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
            return;
        }

        System.out.println(new StringBuilder(string).reverse());
    }

    public static Boolean isPhoneNumber(String string) {
        if (string == null || string.isBlank()) return null;
        return string.matches("8\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isBlank()
                || start < 0 || start > string.length()
                || finish < 0 || finish > string.length()
                || start > finish) {
            System.out.println("Wrong args");
            return;
        }
//        char[] chars = string.toCharArray();
//        for (int i = start, j = finish; i < j; i++, j--) {
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//        }
//        System.out.println(chars);

        String substring = string.substring(start, finish + 1);
        StringBuilder builder = new StringBuilder(substring);
        String replace = string.replace(substring, builder.reverse());
        System.out.println(replace);
    }

    public static String getWordsReverse(String string) {
        if (string == null || string.isBlank()) return null;

//        return IntStream.range(0, words.length).mapToObj(i -> words[words.length - 1 - i]).collect(Collectors.joining(" "));

//        String[] words = string.trim().split("\\s+");
//        StringJoiner reverseWords = new StringJoiner(" ");
//        for (int i = words.length - 1; i >= 0; i--) {
//            reverseWords.add(words[i]);
//        }
//        return reverseWords.toString();

        return String.join(" ", Arrays.asList(string.split(" ")).reversed());
    }

    public static void printWordsReverseInColumn(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
            return;
        }

//        String[] words = string.trim().split("\\s+");
//        StringJoiner reverseWords = new StringJoiner("\n");
//        for (String word : words) {
//            reverseWords.add(new StringBuilder(word).reverse());
//        }
//        System.out.println(reverseWords);

        String collect = Arrays.stream(string.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }

    public static int maxCharIndex(String string) {
        if (string == null || string.isBlank()) return -1;

        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : string.toCharArray()) {
            charMap.merge(c, 1, Integer::sum);
        }
        int max = charMap.values()
                .stream()
                .max(Comparator.naturalOrder())
                .get();
        char maxChar = charMap.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .findFirst()
                .map(Map.Entry::getKey)
                .get();

        return string.indexOf(maxChar);
    }
}
