package semana4;

import java.util.Random;

public class Trabajo1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10);
        }

        for (int i = 0; i < 10000000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                }
            }
            break;
        }
    }
}
