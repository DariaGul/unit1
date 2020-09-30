import java.util.Random;

public class Task2 {

    private final static int LENGTH = 50;

    public static void main(String[] args) {
        int[] array = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            array[i] = i * 2;
            if (i != 0 && i % 2 == 0) {
                array[i] = array[i] * array[i - 1];
            }
            System.out.println(array[i]);
        }
        array = new int[LENGTH];
        System.out.println();

        int i = 0;
        while (i < LENGTH) {
            array[i] = new Random().nextInt(100) * 2;
            if (i != 0 && i % 2 == 0) {
                array[i] = array[i] * array[i - 1];
            }
            System.out.println(array[i]);
            i++;
        }

        array = new int[LENGTH];
        System.out.println();

        i = 0;
        do {
            array[i] = (int) (Math.random() * 100) * 2;
            if (i != 0 && (i & 1) != 1) {
                array[i] = array[i] * array[i - 1];
            }
            System.out.println(array[i]);
            i++;
        } while (i < LENGTH);

    }
}
