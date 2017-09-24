import java.util.Iterator;

public class BinaryTree implements Iterable {

    private final static int NUMBER_OF_BRANCHES = 256; // EXTENDED ASCII

    private Node root;

    public BinaryTree() {
        this.root = new Node(" ");
    }

    public void put(String key) {
        Node node = root;

        for (int i = 0; i < key.length(); i++) {
            int currentChar = key.charAt(i);
            if (node.nodes[currentChar] != null) {
                node = node.nodes[currentChar];
                node.value++;
            } else {
                node.nodes[currentChar] = new Node();
                node = node.nodes[currentChar];
                node.value = 1;
            }
        }
    }

    public String get() {
        return null;
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

        String key;
        int value = 0;

        Node[] nodes = new Node[NUMBER_OF_BRANCHES]; //TODO

        public Node() {
        }

        public Node(String key) {
            this.key = key;
        }
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
