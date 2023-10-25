package P_3_1;

import java.util.Scanner;

public class CombinationsWithRepetitions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int nk1 = n + k - 1;
        int n1 = n - 1;
        int n1F = 0;
        int nk1F = 0;
        int kF = 0;
        int current = 1;
        for(int i = 1; i <= nk1; i++) {
            current *= i;
            if(i == n1) n1F = current;
            if(i == nk1) nk1F = current;
            if(i == k) kF = current;
        }

        int rez;
        if (n == 1) rez = 1;
        else rez = nk1F/n1F/kF;

        System.out.println(rez);
    }
}
