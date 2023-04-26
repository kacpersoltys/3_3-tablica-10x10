import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i][j] = r.nextInt(101) - 50;
            }
        }

        // wyświetlenie tablicy w konsoli
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}