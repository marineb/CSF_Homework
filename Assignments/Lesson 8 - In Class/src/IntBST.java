import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class IntBST {

    private TreeIntNode root;

    public String bfsRepresentation() {
        // TODO: Return a string representation of a breadth-first search of this tree.
        // Nodes are space-delimited, e.g. "1 2 4 5"
        // Hint: Use a queue and, starting with the root node, then enqueue its left and right children.
        // Hint: The StringBuilder class is useful for constructing strings that are constantly appended to

        throw new NotImplementedException();
    }

    public void insertValue(int value) {
        // TODO: Insert a value into the tree, maintaining the 'binary' property of the tree.
        if (this.root == null) {
            TreeIntNode newNode = new TreeIntNode();
            newNode.setValue(value);
            root = newNode;
        }
        else {
            TreeIntNode newNode = new TreeIntNode();
            TreeIntNode currentNode = new TreeIntNode();
            newNode.setValue(value);

            boolean keepInserting = true;

            while (keepInserting) {

                if (value > currentNode.getValue()) {

                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        keepInserting = false;
                    }
                    else if (currentNode.getRight() != null ) {
                        currentNode = currentNode.getRight();
                        keepInserting = true;
                    }
                }
                else if (value < currentNode.getValue()) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        keepInserting = false;
                    }
                    else if (currentNode.getLeft() != null) {
                        currentNode = currentNode.getLeft();
                        keepInserting = true;

                    }
                }
            }
        }

        throw new NotImplementedException();
    }

    public boolean search(int value) {
        // TODO: Return whether the tree contains a given value



        throw new NotImplementedException();
    }

    public void remove(int value) {
        // TODO: Optional Challenge question
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R
        throw new NotImplementedException();
    }
}