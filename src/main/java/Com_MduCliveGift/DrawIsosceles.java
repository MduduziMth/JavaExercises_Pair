package Com_MduCliveGift;

import java.util.Scanner;

public class DrawIsosceles {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Of Number of rows");
        int number = keyboard.nextInt();

        System.out.println(isosceles(number));


    }

    public static String isosceles(int number)
    {
        String hash ="";
        for(int i=1;i<=number;i++)
        {
            for(int j=i;j<=number;j++)
            {
                hash += " ";

            }
            for(int j=1;j<=i;j++)
            {
                hash += "#";

            }
            hash += "\n";


        }
        return hash;
    }
}