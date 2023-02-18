package tasks.examClouds;
/*
Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент уже находится на своем месте.
 */
public class SorterDebug {

    public static void main(String[] args) {
        int[] array = generateRandomArray();

        System.out.println("====sorterDebug=====");
        int[] arr1 = sort(array);
        for (int a : arr1) {
            System.out.print(a + " ");
        }

    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    continue;
                }
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
