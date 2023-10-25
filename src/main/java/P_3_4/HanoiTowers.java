package P_3_4;

import java.util.Scanner;

public class HanoiTowers {
    static int count = 0;
    static String rez = "";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HanoiTowers(n, 1, 3);
        System.out.println(count);
        for(int i = 0; i < rez.length(); i = i+2) {
            System.out.println(rez.charAt(i) + " " + rez.charAt(i+1));
        }
    }

    private static void HanoiTowers(int n, int fromPeg, int toPeg) {
        if (n == 1) {
            rez += "" + fromPeg + toPeg;
            count++;
            return;
        }

        int unusedPeg = 6 - fromPeg - toPeg;
        HanoiTowers(n-1, fromPeg, unusedPeg);
        rez += "" + fromPeg + toPeg;
        count++;
        HanoiTowers(n-1, unusedPeg, toPeg);
    }
}
