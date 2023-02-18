package tasks.projectEuler;
/*
       2520 — это наименьшее число, которое можно разделить на каждое из чисел от 1 до 10 без остатка.
       Какое наименьшее положительное число делится без остатка на все числа от 1 до 20?
       */
public class SmallestMultiple2520 {
    public static void main(String[] args) {


        long lcm=1;
        for(long i=2;i<=20;i++)
        {
            lcm=FindLcm(lcm,i);
        }
        System.out.println("Lcm="+lcm);

    }
    static long FindLcm(long a,long b)
    {
        long lcm,hcf = 0;
        long i=1;

        // Это устанавливает ger равным max(a,b) - почему?
        long ger=a>b?a:b;

        // Это вернет неверный результат, если a == b
        // такого здесь никогда не бывает
        while(i<ger)
        {
            if((a%i==0) && (b%i==0))
                hcf=i;
            i++;
        }
        lcm=(a*b)/hcf;
        return lcm;
    }

}