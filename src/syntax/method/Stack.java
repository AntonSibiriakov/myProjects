package syntax.method;

public class Stack {

    public static void main(String[] args) {


        int a0 = 4;
        int a1 = 5;
        int a = square(a0, a1);//(4) аргумент
        System.out.println(a);
    }
    static int square(int a, int b) {//(int i) параметра

        return a + b; //вернуть
    }}
