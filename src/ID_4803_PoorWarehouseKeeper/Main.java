package ID_4803_PoorWarehouseKeeper;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public int getStepsCount(int target_x, int target_y) {
        double x = 1;
        double y = 1;
        double low = (double) target_y / (double) target_x;
        int cnt = 0;
        double high = (double) (target_y + 1) / (double) target_x;
        double now_value = y / x;
        if (low < 1) {
            return -1;
        }
        y = (int) low;
        cnt += y - 1;
        now_value = (int) low;
        while (true) {
            if (now_value < high && now_value >= low) {
                cnt += (target_x - x);
                return cnt;
            } else if (now_value < low) {
                y += y / x;
                x++;
                cnt++;
            } else {
                y--;
                now_value = y / x;
                x++;
                y = now_value * x;
            }
            while (now_value < low) {
                y++;
                now_value = y / x;
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        while (sc.hasNext()) {
            int target_x = sc.nextInt();
            int target_y = sc.nextInt();
            System.out.println((main.getStepsCount(target_x, target_y)));
        }
        sc.close();
    }
}
