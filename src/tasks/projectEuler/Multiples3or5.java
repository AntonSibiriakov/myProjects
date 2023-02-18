package tasks.projectEuler;
/*
Если мы перечислим все натуральные числа ниже 10, кратные 3 или 5, мы получим 3, 5, 6 и 9. Сумма этих кратных равна 23.
Найдите сумму всех кратных 3 или 5 меньше 1000.
 */
public class Multiples3or5 {
    public static void main(String[] args){
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                total += i;
            }
        }
        System.out.println(total);


    }

}
