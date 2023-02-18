package tasks.projectEuler;
/*
Сумма квадратов первых десяти натуральных чисел равна,
1^2+2^2+... +10^2 = 385
Квадрат суммы первых десяти натуральных чисел равен,
(1+2+... +10)^2 = 55^2 = 3025
Следовательно, разница между суммой квадратов первых десяти натуральных чисел и квадратом суммы равна
3025 — 385 = 2640.
Найдите разницу между суммой квадратов первых ста натуральных чисел и квадратом суммы.
 */
public class SumSquareDifference {
    public static void main(String[] args){



        int squaredSum = 0;
        for (int i = 1; i <= 100; i++) {
            squaredSum+= i;
        }
        System.out.println(squaredSum);

        double sum2 = Math.pow(squaredSum, 2);
        int sum22 = (int) sum2;
        System.out.println(sum22);




        int sumSquared = 0;
        for (int i = 1; i <= 100; i++) {
            double sqr = Math.pow(i, 2);
            sumSquared += sqr;
        }
        System.out.println(sumSquared);

        int defference = sum22 - sumSquared;
        System.out.println(defference);









    }

}
