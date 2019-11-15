package Com_MduCliveGift;

import java.util.Scanner;

public class HelloFunction {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hi there, what's your name?");
        String name = keyboard.next();

        System.out.print(Hello(name));
    }

    public static String Hello(String name)
    {
        return "Hello " + name + "!" ;
    }
}

