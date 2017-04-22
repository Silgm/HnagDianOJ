package ID_1021_FibonacciAgain;

import java.util.Scanner;

public class Main {
    private boolean isRight(int value) {
        return (value - 2) % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        while (input.hasNext()) {
            if (main.isRight(input.nextInt())) {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        input.close();
    }
}
