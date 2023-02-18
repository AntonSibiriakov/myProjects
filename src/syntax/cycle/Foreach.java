package syntax.cycle;

public class Foreach {

    public static void main(String[] args) {

        /*
        При прохождении цикла переменной str автоматически присваивается значение,
        равное значению следующего элемента массива
         */
        int[] arr = {1, 5, 7, 8};
        for (int str : arr) {// у переменной и массива одинаковый тип данных
            System.out.println("Значение: " + str);
        }
    }
}