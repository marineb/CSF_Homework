/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 12/16/13
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class PetWalker{
    public void walkPet (Moveable pet) {  //all that we can call is what's defined in the interface, here MOverable
        System.out.println(pet.move());
    }
}
