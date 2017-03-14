import java.io.*;
import java.util.*;

public class Solution {

    public static String getStr(int n, char c) {
        StringBuilder str = new StringBuilder(n);
        for (int i=0;i<n;i++) {
            str.append(c);
        }
        return str.toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        for (int i=0;i<size;i++) {
            System.out.println(getStr(size-i-1, ' ') + getStr(i+1,'#'));
        }
    }
}