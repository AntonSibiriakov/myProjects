package tasks.codeWars;

public class reversalOfWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("   "));
    }
    public static String reverseWords(final String original) {
        String[] arrStr = original.split(" ");
        String total = "";
        for (int i = 0; i < arrStr.length; i++) {
            total += " ";
            for (int j = 0; j < arrStr[i].length(); j++) {
                String regular ="" + arrStr[i].charAt(arrStr[i].length() - j-1);
                total += regular;
            }
        }
        return total.substring(1);
    }
}
