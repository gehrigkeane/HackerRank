import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time_12 = in.next();
        
        // First match midnight
        if (time_12.matches("^12:\\d{2}:\\d{2}AM")) {
           System.out.println("00" + time_12.substring(2,8)); 
        }
        // Second match all AM times + 12PM times
        else if (time_12.matches("^\\d{2}:\\d{2}:\\d{2}AM") || time_12.matches("^12:\\d{2}:\\d{2}PM")) {
            System.out.println(time_12.substring(0,8));
        } else {    // This assumes valid input, which is rarely acceptable
            Integer hour = 12 + Integer.parseInt(time_12.substring(0,2));
            System.out.println(hour + time_12.substring(2,8));
        }
    }
}