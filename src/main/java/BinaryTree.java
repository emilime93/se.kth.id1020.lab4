import java.util.Iterator;

public class BinaryTree implements Iterable {

    private final static int NUMBER_OF_BRANCHES = 256; // EXTENDED ASCII

    private Node root;

    public BinaryTree() {
        this.root = new Node(); //Root Node
    }

    public void put(String key) {
        Node node = root;

        for (int i = 0; i < key.length(); i++) {
            int currentChar = key.charAt(i);
            if (node.children[currentChar] != null) {
                node = node.children[currentChar];
                node.value++;
            } else {
                node.children[currentChar] = new Node();
                node = node.children[currentChar];
                node.value = 1;
            }
            node.isCompleteWord = true;
        }
    }

    public int getValue(String key) {
        Node node = root;

        for (int i = 0; i < key.length(); i++) {
            int currentChar = key.charAt(i);
            if (node.children[currentChar] != null) {
                node = node.children[currentChar];
            } else {
                return 0;
            }
        }
        return node.value;
    }

    public int count() {
        return 0;
    }

    public int distinct() {
        return 0;
    }

    public Iterator iterator() {

        return null;
    }

    private class Node {
        int value = 0;
        boolean isCompleteWord;
        Node[] children = new Node[NUMBER_OF_BRANCHES];
    }

    private class BinaryTreeIterator implements Iterator<BinaryTree> {

        public boolean hasNext() {
            return false;
        }

        public BinaryTree next() {
            return null;
        }

        public void remove() {
            /* No implementation */
        }
    }
}
