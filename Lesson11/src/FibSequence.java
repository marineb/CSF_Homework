public class FibSequence {
    /**
     * Returns the nth fibonacci number, recursively computed.
     * The 0th fibonacci number is 0
     * The 1st is 1
     * The 2nd is 1
     * The 3rd is 2
     * etc
     * @param n The index in the fibonacci sequence to recursively calculate
     * @return The respective fibonacci number
     */
    int fibNumber(int n) {
        // TODO: Fill out to make FibSequenceTest pass


        // Sample soln:
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
//          the else statement was how i had built it. But we can just do a return at the bottom
//        else {
//
//            int fibNumber = fibNumber(n-1) + fibNumber(n-2);
//            return fibNumber;

//        }

        //return 0;
        return fibNumber(n - 1) + fibNumber(n - 2);
    }

}
