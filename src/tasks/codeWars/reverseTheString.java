package tasks.codeWars;
public class reverseTheString  {
    public static void main(String[] args) {
        System.out.println(solution("heg"));
    }
    public static String solution(String str) {
        String revers = new String();
        for (int i = 0; i < str.length(); i++) {
            revers += ""+str.charAt(str.length() - i-1);
        }
        return revers;
    }
}
