public class IntStack {
    IntListNode firstNode;

    public IntStack() {
    }

    public void push(int value) {
        // TODO: Add a value to the top of the stack
        //
        if (firstNode == null) {
            firstNode = new IntListNode(value);
        }
        else {
            IntListNode newNode= new IntListNode(value);
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }

    }

    public int pop() {
        // TODO: Pop the first value off the stack
        if (firstNode == null) {
            // do nothing
            throw new IllegalArgumentException();  // exception
        }
        else {
            IntListNode thatNode = firstNode;
            if (firstNode.getNextNode() != null) {
                firstNode = firstNode.getNextNode();
            }
            else {
                firstNode = null;
            }
            return thatNode.getValue();

        }

    }

    public int size() {
        // TODO: Fill out this method
        if (firstNode == null) {
            // do nothing
            throw new IllegalArgumentException();  // exception
        }

        int counter = 1;
        IntListNode currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            counter ++;
        }

        return counter;


    }
}

