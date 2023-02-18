package tasks.skyPro;

public class СycleSpruce {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int middle = 5;
                arr[middle - i] = 1;
                arr[middle + i] = 1;
                System.out.print(arr[j]);
            }
            System.out.println();





        }
    }
}

