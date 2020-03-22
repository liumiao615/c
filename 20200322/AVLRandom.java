import java.util.Random;

public class AVLRandom {
    public static void main(String[] args) {
        Random random = new Random(20200320);
        for (int i = 0; i < 25; i++) {
            int n = random.nextInt(200);
            System.out.println(n);
        }
    }
}
