public class IntLinkedList {
    private IntListNode firstNode;


    // IntLinkedList stores a list of unique integers
    public IntLinkedList() {

    }

    public void insert(int value) {
        // TODO: Add the integer, or take no action if it's already in the list
        if (firstNode == null) {
            firstNode = new IntListNode(value);
        }
        else {

            if (!this.contains(value)) {   //we make sure this list doesn't have that integer already
                IntListNode newNode= new IntListNode(value);
                newNode.setNextNode(firstNode);
                firstNode = newNode;

            }

            //IntListNode currentNode = firstNode;
            //while (currentNode.getNextNode() != null) {
            //    currentNode = currentNode.getNextNode();
            //}
            //currentNode.setNextNode(newNode);

        }
    }

    public boolean contains(int value) {
        // TODO: Print out if the linked list contains the given integer
        if (firstNode == null) {
            throw new IllegalArgumentException();
        }
        IntListNode currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            if (currentNode.getValue() == value) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        if (currentNode.getValue() == value) {
            return true;
        }
        return false;
    }



    public void remove(int value) {
        // TODO: Remove the given integer from the list, or take no action if it's not in the list
        if (!this.contains(value)) {
            throw new IllegalArgumentException();
        }
        else {
            // TODO STUFF
            // make the node before it linked to the node after it -- i don't think this does it.
            IntListNode theNode = new IntListNode(value);
            IntListNode daNextNode = theNode.getNextNode();
            firstNode = daNextNode;
        }
    }

    public void print() {
        IntListNode node = firstNode;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNextNode();
        }
    }
}