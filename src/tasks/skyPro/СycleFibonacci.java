package tasks.skyPro;

public class СycleFibonacci {

    public static void main(String[] args){

        int a = 0;
        int b = 1;
        for (int i = 0; i < 4; i++) {
            a += b;
            b+= a;
            System.out.print(a + " " + b + " ");
        }

    }
}
