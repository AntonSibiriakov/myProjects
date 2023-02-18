package tasks.projectEuler;

public class PrimeNumber10001 {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 1;  ; i++) {

            if (isPrimeOptimized(i)) {
                num++;
                if (num == 10001) {
                    System.out.println( i);
                }
            }
        }

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