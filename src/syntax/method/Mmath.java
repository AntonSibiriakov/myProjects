package syntax.method;

public class Mmath {
    public static void main(String[] args){

        double a = Math.pow(2, 3);//Возведение в степень (2^3)
        System.out.println("power of " + a);


        int b = Math.min(4, 8);// Минимальное число
        System.out.println("min " + b);

        int c = Math.max(4, 8);// Максимальное число
        System.out.println("max " + c);

        Math.abs(-16);// Модуль
        int d = Math.abs(-16);
        System.out.println("module " + d);


        int e =(int) (Math.random() * 100);// Random -0.0 to 1.0
        System.out.println("random " + e);// 0 to 100



    }
} 