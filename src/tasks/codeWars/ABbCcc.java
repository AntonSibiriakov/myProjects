package tasks.codeWars;

public class ABbCcc {
    public static void main(String[] args) {
        System.out.println(accum("rdvafdv"));
    }
    //toLowerCase()
    //toUpperCase() переводит строку в верхний регистр
    //substring(0) создать строку без символа по индексу
    public static String accum(String s) {
        String total = new String();
        for (int i = 0; i < s.length()+1; i++) {
            for (int j = 0; j < i; j++) {
            String regular = ""+s.charAt(i-1);;
                total +=j<=0? "-"+regular.toUpperCase():regular.toLowerCase();
            }
        }
        return total.substring(1);
    }
}
