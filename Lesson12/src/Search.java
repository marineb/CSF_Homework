import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Search {

    /**
     * @param array A sorted array of ints to search through. This must be sorted.
     * @param searchTerm An int to search the array for
     * @return Whether the searchTerm exists in the array
     */
    public static boolean binarySearch(int[] array, int searchTerm) {
        /*
        TODO: Fill this in. Note that you can either make copies of the array
         as you search, or perform the search without ever copying the array.
         Start with the former, then try for the latter.
         */

        if (array.length == 0) {
            return false;
        }

        else if (array.length == 1 && searchTerm!= array[0]) {
            return false;
        }


        else if (array.length == 1 && searchTerm == array[0]) {
            return true;
        }

        else if (searchTerm == array[array.length/2]) {
            return true;
        }

        else if (array.length == 0) {
            return false;
        }

        else {

            if (array[array.length/2] > searchTerm) {
                int left[] = Arrays.copyOfRange(array, 0, array.length/2);
                return binarySearch(left, searchTerm);
                // above line: style improvement, allows not to have an if statement that evaluates if it returns true or false;
            }

            else if (array[array.length/2] <= searchTerm) {

                int right[] = Arrays.copyOfRange(array, array.length/2, array.length);

                return binarySearch(right, searchTerm);
            }

        }

        return false;

        //throw new NotImplementedException();
    }
}
