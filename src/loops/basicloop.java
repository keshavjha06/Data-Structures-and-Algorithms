package loops;

public class basicloop {

    public static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        // loop will run 50 times
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }

        // loop will run 100 times
        for (int i = 1; i <= 100; i = i + 1) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

    }

}
