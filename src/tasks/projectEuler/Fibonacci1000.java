package tasks.projectEuler;
/*
Последовательность Фибоначчи определяется рекуррентным соотношением:
12-й член,  является первым членом, содержащим три цифры.
Какой индекс первого члена в последовательности Фибоначчи должен содержать 1000 цифр?
Последняя итерация4786
 */
import java.math.BigInteger;
public class Fibonacci1000 {
    public static void main(String[] args) {


        BigInteger i = cycle(1000);// получение числа с 1000 знаками
        int finish = sum(i);
        System.out.println("Последняя итерация" + finish);





    }






    public static int sum(BigInteger i) {

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        for (int j = 0; ; ) {

            a=b.add(a);
            j++;
            if (j < 20 || j > 4780) {
                System.out.println(j + "  " + a);
            }
            b=a.add(b);
            j++;
            if (j < 5 || j > 4780) {
                System.out.println(j + "  " + b);
            }
            if (a.compareTo(i) > 0 || b.compareTo(i) > 0) {
                return j;

            }





        }




    }




    public static BigInteger cycle(int i) {
        BigInteger k10 = BigInteger.valueOf(10);
        BigInteger k = new BigInteger("1");
        for (int j = 0; j < i; j++) {
            k = k10.multiply(k);
            System.out.println(j + " " + k);


        }
        System.out.println("h" + k);



        return k;
    }


}