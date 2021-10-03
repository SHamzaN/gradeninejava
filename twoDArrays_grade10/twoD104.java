package AP.twoDArrays;


public class twoD104
{

    public static void main(String[] args)
    {
        int[][] twoD = { { 1, 2 }, // Index 0
                //{ 3, 4 }, // Index 1
                { 3, 4, 99 }, // new index 1(jagged array)
                { 5, 6 } };// Index 2

        int count = 1;

        for(int out = 0; out < 3; out++)//outer loop keeps track of rows
        {
            for(int in = 0; in < 2; in++) //inner loop keeps track of colums
            {
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }
        System.out.println("\n");

        for(int out = 0; out < 3; out++)//keeps track of rows
        {
            for(int in = 0; in < 2; in++)//keeps track of columns
            {
                System.out.print("[" + out + "]" + "[" + in + "]" + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for(int out = 0; out < twoD.length; out++)//keeping track of rows
        {
//for(int in = 0; in < twoD[0].length; in++)//keeping track of columns - using index  0 willnot work with jagged arrays
            for(int in = 0; in < twoD[out].length; in++)
            {
                System.out.print(twoD[out][in] + " ");
            }
            System.out.println();
        }

    }

}

