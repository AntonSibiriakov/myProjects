package tasks.projectEuler;
/*
Простые множители 13195 равны 5, 7, 13 и 29.
Какой самый большой простой множитель числа 600851475143 ?
 */
public class LargestPrimeFactor {

    public static void main(String[] args){
        int lpf= 2;


        long num = 600851475143L;
        while (num > lpf) {
            if (num % lpf == 0) {
                num/=lpf;
                lpf = 2;
            } else {
                lpf++;
            }
        }
        System.out.println(lpf);

    }
}
