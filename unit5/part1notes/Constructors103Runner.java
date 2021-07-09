package ghar.javawork.virtual.unit5.part1notes;

import java.util.Scanner;

public class Constructors103Runner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Because this has no parameters it calls the unseen default constructor
        //	Constructors103 con = new Constructors103(); // Default constructor call (no parameters)

        System.out.print("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scan.nextInt();

        /* Because this class constructor call has parameters, java knows to call
         * the method we created and not the default constructor that does
         * not have any parameters. */
        Constructors103 con = new Constructors103(number1, number2);

        con.outputValues();

    }
}
