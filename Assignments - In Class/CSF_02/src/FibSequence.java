import java.util.Scanner;


public class FibSequence {
    public int numberAtPosition(int sequenceNumber) {

        /*
        TODO:
        * Input: nth number given as an integer
        * Create an array n long, the first two values should be 0,1
        * Build the array by adding the two previous numbers to each other
        * Print the last number in the array
         */
        int n =  sequenceNumber;
        int[] myArray = new int[n];
        myArray[0]=0;
        myArray[1]=1;

        for (n=2 ; n < myArray.length ; n++) {
            int num1 = myArray[n-1];
            int num2 = myArray[n-2];

            myArray[n] = num1 + num2;

        }

        int hello = myArray.length;
        System.out.println(myArray[hello-1]);

        return 0;
    }
}