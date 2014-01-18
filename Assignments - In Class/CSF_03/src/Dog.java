/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 12/16/13
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Dog implements Moveable {


    private String name;

    private int numberOfLegs = 4;


    public Dog() {
        this.numberOfLegs = 4;
        this.name = "Rover";

    }


    public Dog(String name) { //
        this(); //this will call the Dog thing above. And set the name to rover, etc.  instead of pulling the original one.
        this.name = name;
    }


    public String bark() {
        return "Woof!";
    }

    public int numberOfLegs() {
        return 4;
    }

    public String move() {
        return this.name+ "walked 4 steps";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String getBreed();


}
