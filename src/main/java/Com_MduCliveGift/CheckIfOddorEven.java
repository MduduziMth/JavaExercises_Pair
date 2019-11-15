package Com_MduCliveGift;

import java.util.Scanner;

public class CheckIfOddorEven {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Number to check if Odd or Even");
        int number = keyboard.nextInt();

        System.out.println(evenOrOdd(number));


    }

    public static String evenOrOdd(int number)
    {
        if(number % 2 == 0)
        {
            return "Number is Even";
        }
        else
            return "Number is Odd";
    }
}
