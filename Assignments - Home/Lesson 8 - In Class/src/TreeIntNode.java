/**
 * Created with IntelliJ IDEA.
 * User: marine
 * Date: 1/13/14
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeIntNode {
   private TreeIntNode left;
   private TreeIntNode right;
   private int value;

    public TreeIntNode getRight() {
        return right;
    }

    public void setRight(TreeIntNode right) {
        this.right = right;
    }

    public TreeIntNode getLeft() {
        return left;
    }

    public void setLeft(TreeIntNode left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
