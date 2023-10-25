package P_3_5;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
