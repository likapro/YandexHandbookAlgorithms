package P_3_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countArr = s.nextInt();

        List<Integer[]> list = new ArrayList<>();
        for(int i = 0; i < countArr; i++) {
            int n = s.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            list.add(arr);
        }

        list.sort(Comparator.comparingInt(o -> o.length));

        List<Integer> rez = new ArrayList<>();
        for(int i = 0; i < countArr; i++) {
            rez = merge(rez, list.get(i));
        }

        rez.stream().forEach(x -> System.out.print(x + " "));
    }

    private static List<Integer> merge(List<Integer> rez, Integer[] arr) {
        List<Integer> mergeArr = new ArrayList<>();

        for(int i = 0, j = 0; i < rez.size() || j < arr.length; ) {
            if(i == rez.size()) {
                mergeArr.add(arr[j++]);
            } else if (j == arr.length) {
                mergeArr.add(rez.get(i++));
            } else if (rez.get(i) < arr[j]) {
                mergeArr.add(rez.get(i++));
            } else {
                mergeArr.add(arr[j++]);
            }
        }

        return mergeArr;
    }
}
