/**
 * Write a description of class CommonTools here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CommonTools
{
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int [] numbers = new int[10];
        int High;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = reader.nextInt();

        }

        System.out.println("All numbers are entered!");
        High = findHighNumber (numbers);
        System.out.println("The Highest number in the array is " + High);

    }

    public static int findHighNumber( int [] array)
    {
        int High = array[0];
        for (int i = 0; i < array.length; i++){

            if(High < array[i])
            {
                High = array[i];
            }
            
        }
        return High;
    }
}