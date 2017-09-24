import java.util.Iterator;

public class Trie implements Iterable {

    private final static int NUMBER_OF_BRANCHES = 256; // EXTENDED ASCII

    private Node root;

    public Trie() {
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

    private Node traverseTo(String key) {
        Node node = root;
        for (int i = 0; i < key.length(); i++) {
            int currentChar = key.charAt(i);
            if (node.children[currentChar] != null) {
                node = node.children[currentChar];
            } else {
                return null;
            }
        }
        return node;
    }

    public int getValue(String key) {
        Node node = traverseTo(key);
        if (node != null) {
            return node.value;
        }
        return 0;
    }

    public int count(String key) {
        Node node = traverseTo(key);
        if (node == null) {
            return 0;
        }
        return count(node);
    }

    private int count(Node startNode) {
        int value = startNode.value;
        for (int i = 0; i < NUMBER_OF_BRANCHES; i++) {
            if (startNode.children[i] != null) {
                System.out.println("if passed");
                value += count(startNode.children[i]);
            }
        }
        return value;
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

    private class BinaryTreeIterator implements Iterator<Trie> {

        public boolean hasNext() {
            return false;
        }

        public Trie next() {
            return null;
        }

        public void remove() {
            /* No implementation */
        }
    }
}
