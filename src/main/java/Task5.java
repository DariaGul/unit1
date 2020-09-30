public class Task5 {

    private final static int LENGTH = 11;

    public static void main(String[] args) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == j || LENGTH - i - 1 == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
