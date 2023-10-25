package P_3_1;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rez = 1;
        for(int i = 1; i <= n; i++) {
            rez *= i;
        }
        System.out.println(rez);
    }
}
