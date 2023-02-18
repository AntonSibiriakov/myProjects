package tasks.projectEuler;
/*
Сумма простых чисел ниже 10 равна 2 + 3 + 5 + 7 = 17.
Найдите сумму всех простых чисел меньше двух миллионов.
 */
public class SumPrimeNumbers {

    public static void main(String[] args) {

        long total = 0;
        for (int i = 1; i < 2000000; i++) {
            if (isPrimeOptimized(i)) {
                total += i;
            }

        }
        System.out.println(total);

    }

    private static boolean isPrimeOptimized(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}