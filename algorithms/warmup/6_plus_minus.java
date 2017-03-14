import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float size = in.nextFloat();

        float[] types = new float[] {0, 0, 0};
        
        for (int i=0;i<size;i++) {
            int val = in.nextInt();
            if (val > 0) { types[0]++; }
            else if (val < 0) { types[1]++; }
            else { types[2]++; }
        }
        
        System.out.println(types[0]/size);
        System.out.println(types[1]/size);
        System.out.println(types[2]/size);
    }
}