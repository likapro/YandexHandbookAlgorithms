package P_3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookingMeetingRoom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n > 0) {
            List<Pair> pairs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int l = s.nextInt();
                int r = s.nextInt();
                pairs.add(new Pair(l, r));
            }
            pairs.sort(Comparator.comparingInt(Pair::getRight));

            Pair pair = pairs.get(0);
            int right = pair.getRight();
            int count = 1;
            for (int i = 0; i < pairs.size(); i++) {
                Pair pair1 = pairs.get(i);
                if (pair1.getLeft() > right) {
                    right = pair1.getRight();
                    count++;
                }
            }

            System.out.println(count);
        }
        else System.out.println(0);
    }
}

class Pair {
    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
