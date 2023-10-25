package P_3_3;

import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        if (n%2 == 0 && m%2 == 0) System.out.println("Loose");
        else System.out.println("Win");
    }
}
