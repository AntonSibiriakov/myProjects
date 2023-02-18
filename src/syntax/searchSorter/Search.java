package syntax.searchSorter;

public class Search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("=====linearSearch=====");
        // проверяет каждый элемент на соответствие
        int a = linearSearch(arr, 6);
        System.out.println(a);

        System.out.println("\n=====binarySearch=====");
        // делит пополам и выбирает половину для следующего деления
        int b = binarySearch(arr, 6);
        System.out.println(b);

        System.out.println("\n=====recursiveBinarySearch=====");


        System.out.println("\n=====jumpSearch=====");
        // прыгает через указанной кол-во эллементов и выбирает сторону для след прыжка




    }

    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        // условие прекращения
        if (lastElement >= firstElement) {
            int middle = (lastElement + firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middle] == elementToSearch) {
                return middle;
            }

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (array[middle] > elementToSearch) {
                return recursiveBinarySearch(array, firstElement, middle - 1, elementToSearch);
            }

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(array, middle + 1, lastElement, elementToSearch);
        }
        return -1;
    }
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }
}
