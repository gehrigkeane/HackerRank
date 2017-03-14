import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(in.nextInt()); a.add(in.nextInt()); a.add(in.nextInt());
        b.add(in.nextInt()); b.add(in.nextInt()); b.add(in.nextInt());
        int[] score = new int[] {0, 0};
        for (int i = 0; i<3; i++) {
            if (a.get(i) > b.get(i)) {
                score[0]++;
            } else if (a.get(i) < b.get(i)) {
                score[1]++;
            }
        }
        System.out.print(score[0] + " " + score[1]);
    }
}
