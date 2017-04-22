package ID_4203_DoubloonGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        while (times > 0) {
            int count = input.nextInt();
            int k = input.nextInt();
            if (k % 2 == 0) {
                int position = count % (k + 1);
                if (position == k) {
                    System.out.println(k);
                } else {
                    System.out.println(position % 2);
                }
            } else {
                System.out.println(count % 2);
            }
            times--;
        }
    }
}
