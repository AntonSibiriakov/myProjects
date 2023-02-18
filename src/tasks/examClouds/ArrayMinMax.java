package tasks.examClouds;
/*
Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
Распечатать массив, содержащий максимальное и минимальное значение.
 */
public class ArrayMinMax {
    public static void main(String[] args) {

        // создание 2 массива


        int[][] arr1 = new int[5][2];
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }


        // создание 1 массива и заполнение макс и мин

        int[][] arr = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > arr1[i][1]) {
                    arr1[i][1] = arr[i][j];
                    arr1[i][0] = arr[i][j];
                }
                if (arr[i][j] < arr1[i][0]) {
                    arr1[i][0] = arr[i][j];
                }


            }
            System.out.println();
        }

        //  печать итога
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }
}
