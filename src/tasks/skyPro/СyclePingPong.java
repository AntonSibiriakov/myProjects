package tasks.skyPro;

public class СyclePingPong {

    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println("ping");
            } else if (i % 5 == 0) {
                System.out.println("pong");
            } else {
                System.out.println();
            }


        }
        //Task 2????
        int j = 1;
        for (int i = 1; i < 10; i++) {

            j+= i;
            System.out.print(j);


        }


        //Task 3



    }
}