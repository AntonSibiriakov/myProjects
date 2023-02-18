package syntax.searchSorter;

public class Sorter {

    public static void main(String[] args) {
        int[] array = generateRandomArray();

        System.out.println("====bubbleSorter=====");//смещение числа с меньшим значением
        int[] arr1 = sort(array);
        for (int a : arr1) {
            System.out.print(a + " ");
        }


        System.out.println("\n====selectionSorter=====");// поиск наименьшего элемента, смена с элементом стоящим на его позщиции
        int[] arr2 = sort1(array);
        for (int b : arr2) {
            System.out.print(b + " ");
        }




    }
    public static int[] sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
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

    public static int[] sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
        return array;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}