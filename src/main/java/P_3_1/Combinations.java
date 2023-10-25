package P_3_1;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int nk = n - k;
        int nF = 1;
        int kF = 1;
        int nkF = 1;
        int current = 1;
        for(int i = 1; i <= n; i++) {
            current *= i;
            if(i == k ) kF = current;
            if(i == nk) nkF = current;
            if(i == n) nF = current;
        }

        int rez;
        if (n == k) rez = 1;
        else if (n < k) rez = 0;
        else rez = nF/nkF/kF;

        System.out.println(rez);
    }
}
