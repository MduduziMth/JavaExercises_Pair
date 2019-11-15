package Com_MduCliveGift;

import java.util.Scanner;

public class DrawTriangle {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Square Number");
        int number = keyboard.nextInt();

        System.out.println(triangle(number));
    }

    public static String triangle(int NumberOfTriangle)
    {
        String hash = "";
        for(int i= 1; i <= NumberOfTriangle;i++ )
        {
            for(int j = 1; j <= i; j++)
            {
                hash += "#";
            }
            hash += "\n";
        }

        return hash;
    }
}
