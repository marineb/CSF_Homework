/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 12/14/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Assigment02 {
    /**
     * Write a program that matches each person in the
     * class with another, randomly assigned
     * person in the class. Given the names of
     * all the students in the class, the program should assigns each
     * a random partner and prints out the results.
     * Each person should have no more than one code review partner
     * (or, one person can have two in the case of an odd number).
     */


    public static void main(String[] args) {
        randomStudents();
    }

    public static void randomStudents() {
        String[] names = {"Kevin", "Ernie", "Marine", "Granger", "Shirley", "Fred", "Rachel", "Mandeep", "Hunter", "TJ"};
        List<String> l = Arrays.asList(names);
        Collections.shuffle(l);
        //System.out.print(l);

        System.out.println(l.get(0) + " and " + l.get(1));
        System.out.println(l.get(2) + " and " + l.get(3));
        System.out.println(l.get(4) + " and " + l.get(5));
        System.out.println(l.get(6) + " and " + l.get(7));
        System.out.println(l.get(8) + " and " + l.get(9));

    }

}
