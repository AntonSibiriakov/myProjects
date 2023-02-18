package tasks;
/*
Число 197 называется круговым простым, потому что все повороты цифр: 197, 971 и 719, сами по себе являются простыми.
Ниже приведено тринадцать таких простых чисел 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, и 97.
Сколько круговых простых чисел меньше одного миллиона?
https://www.mathblog.dk/project-euler-35-circular-primes/
 */

public class Projecteuler_35 {
    public static void main(String[] args) {
        //Task 1
        int j = 0;
        for (int i = 0; i < 1000; ) {

            if (i % 3 == 0) {
                j += i;;
            }
            if (i % 5 == 0) {
                j += i;
            }
            i++;

        }
        System.out.println(j);
    }

}
