import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] list = new int[size*size];
        for (int i=0;i<(size*size);i++) {
            list[i] = in.nextInt();
        }

        int[] sums = new int[] {0, 0};
        int[] offset = new int[] {size+1, size-1};
        int[] steps = new int[] {0, offset[1]};

        for (int i=0;i<size;i++) {
            sums[0] += list[steps[0]];
            sums[1] += list[steps[1]];

            steps[0] += offset[0];
            steps[1] += offset[1];
        }
        System.out.print(Math.abs(sums[0] - sums[1]));
    }
}