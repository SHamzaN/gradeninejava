package ghar.javawork.virtual.unit3.part1;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Word--> ");

        String st11 = s.nextLine();
        int sizeStr1 = st11.length();

        System.out.println("Enter Second Word--> ");
        String st12 = s.nextLine();
        int sizeStr2 = st12.length();
        //////////////////////////////////


        if( sizeStr1 == sizeStr2 ){
            System.out.println( st11 +  " has the same # of letters as " + st12 );
        }else{
            System.out.println( st11 + " does not have the same # of letters as " + st12 );

        }
    }
}

