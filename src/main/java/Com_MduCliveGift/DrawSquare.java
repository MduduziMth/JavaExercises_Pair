package Com_MduCliveGift;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Square Number");
        int number = keyboard.nextInt();

        System.out.println(square(number));


    }

    public static String square(int NumberOfSquares)
    {
        if(NumberOfSquares == 1) {
            return "#";
        }


        String hash = "" ;
        int rowCount = 0;
        while(rowCount<NumberOfSquares){
            String row = "";
            for(int i = 0; i<NumberOfSquares; i++){
                row += "#";
            }
            hash += row;
            hash += "\n";
            rowCount++;
        }
        return hash;
    }

}
