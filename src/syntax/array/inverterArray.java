package syntax.array;

public class inverterArray {

    public static void main(String[] args) {

        int[] array = {1, 6, 8, 5, 4, 7};


        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i]; // инициализация переменной 1 значением массива
            array[i] = array[array.length - i - 1]; // инициализаци первого значения массива последним
            array[array.length - i - 1] = tmp; // инициализация последнего значения массива переменной со значением 1 эллемента
        }
        for (int i : array) {
            System.out.print(i);
        }
    }
}