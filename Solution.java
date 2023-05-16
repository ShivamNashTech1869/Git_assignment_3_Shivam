/* Day-16 Task ->(Exceptions - String to Integer):
   Read a string , and print its integer value .
   if string cannot be converted to an integer, print Bad String.
   */

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Read a value as String and convert it into integer ");

        System.out.print("Enter any Value : ");

        String string = scanner.next();


        try {
        
            //Convert string value into Integer .

            int integerValue = Integer.parseInt(string);

            System.out.println("Convert successfully , value : " + integerValue);

        }
        catch(Exception e) {

            System.out.println("It can't be convert to Integer : Bad String");
        }

    }
}
