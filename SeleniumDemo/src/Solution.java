import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            BMW b = new BMW();
            if(name.equals("reverseGear")){
                b.reverseGear();
            }
            if(name.equals("switchOnHeadlights")){
                b.switchOnHeadlights();
            }
            if(name.equals("topSpeed")){
                b.topSpeed();
            }
        }
    }
}