package tasks.codeWars;

public class reverseTheString  {
    //extends selfLearning.syntax.array.tasks.projectEuler.LargestProduct

    public static void main1(String[] args) {


        System.out.println(solution("heg"));

    }

    public static String solution(String str) {
        String revers = new String();
        for (int i = 0; i < str.length(); i++) {
            revers += str.charAt(str.length() - i);
        }

        return revers;
    }
}
