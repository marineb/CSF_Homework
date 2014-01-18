/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 12/16/13
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chihuahua extends Dog {
    @Override //this means this is overriding parent class. It's optional but it makes it clearer.
    public String bark() {
        //return "yip!";
        return super.bark(); //here we're getting the parent class's bark's.
    }

    @Override //this means this is overriding parent class. It's optional but it makes it clearer.
    public String setBreed() {
        //return "yip!";
        return super.bark(); //here we're getting the parent class's bark's.
    }
}
