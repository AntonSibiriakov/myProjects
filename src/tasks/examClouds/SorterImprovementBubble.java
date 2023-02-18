package tasks.examClouds;

public class SorterImprovementBubble {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int[] arr1 = sort(arr);
        for (int a : arr1) {
            System.out.print(a + " ");
        }





    }
    public static int[] sort(int[] array) {// от большего к меньшему
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;


                }
            }
        }
        return array;
    }
    /*
            public static int[] sort(int[] array) {// от меньшего к большему
                for (int i = 0; i < array.length; i++) {
                    for (int j = array.length - 1; j > i; j--) {
                        if (array[j - 1] > array[j]) {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
                return array;
        }
     */
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
