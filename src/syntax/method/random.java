package syntax.method;

public class random {
    public static void main(String[] args) {
        System.out.println(generateRandomInt(1,10));
    }



    public static int[] generateRandomArray(int length, int min, int max) {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max + 1 - min) + min;
        }
        return arr;
    }


    public static int generateRandomInt(int min, int max) {
        java.util.Random random = new java.util.Random();
        return random.nextInt(max + 1 - min) + min;
    }
}