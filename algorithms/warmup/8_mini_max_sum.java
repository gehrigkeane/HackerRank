import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*  Let's see...
			If there are always five values, the straightforward approach is to perform
			all 5 sums, take min and max, and call it a day.
			
			-> Alternatively, let's create a TreeSet:
				- which is inherently sorted
				- And the min and max can be calculated , call it a day.
			
		*/
		Scanner in = new Scanner(System.in);
		
		TreeSet<Long> ts = new TreeSet<Long>();
		long sum = 0;
		long bucket = 0;
		for(int i = 0; i<5; i++) {
			bucket = in.nextLong();
			sum += bucket;
			ts.add(bucket);
		}
		/*  The sum-ts.last produces the min, sum-ts.first produces the max
				- b/c the TreeSet is ordered, the first and last values correspond to min and max values
				- hence the difference between the total sum (denoted as sum) and the minimum value (denoted as ts.first)
				  produces the largest 4-term sum.
				- The same logic applies to the smallest 4-term sum 
		*/
		System.out.print((sum-ts.last()) + " " + (sum-ts.first()));
	}
}