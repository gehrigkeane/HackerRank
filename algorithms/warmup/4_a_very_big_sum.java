import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        for (int i=in.nextInt(); i>0; i--) {
            sum += in.nextLong();
        }
        System.out.print(sum);
    }
}