package syntax.cycle;

public class While {

    public static void main(String[] args) {
        // цикл while подходит когда не известно прмерное кол-во циклов


        int a = 10;
        //пока (a > 10) {мы будем выполнять это}
        while (a > 1) {
            System.out.println("a > 10 " + a--);
        }
        //Поиск ср
        int b = 100;
        int c = 200;
        while (++b < --c);
        System.out.println("середина " + b);


        //Цикл do while
        // Сначала выполняется действие (do), затем выполняется проверка (while)
        // 1 раз операция цикла выполнится на зависимо от условий
        int a0 = 10;

        do {
            System.out.println(a0);
            a0++;
        } while (a0 < 15);

        //if для прерывания цикла
        int a1 = 10;
        while (a1 > 1) {
            System.out.println("a1 " + a1);

            a1++;
            if (a1 == 15) break;


        }


    }
}

