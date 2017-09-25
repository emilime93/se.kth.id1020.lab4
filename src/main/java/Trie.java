import java.util.Iterator;
import java.util.Map;

public class Trie implements Iterable {

    private final static int NUMBER_OF_BRANCHES = 256; // EXTENDED ASCII

    private Node root;

    private int numberOfElements = 0;

    public Trie() {
        this.root = new Node(); //Root Node
    }

    public void put(String key) {
        Node node = root;

        for (int i = 0; i < key.length(); i++) {
            int currentChar = key.charAt(i);
            if (node.children[currentChar] != null) {
                node = node.children[currentChar];
                if (i == key.length() - 1)
                    node.value++;
            } else {
                node.children[currentChar] = new Node();
                node = node.children[currentChar];
                if (i == key.length() - 1) {
                    node.value = 1;
                }
            }
        }
        numberOfElements++;
    }

    /**
     * Godlike helper-method
     *
     * @param key
     * @return
     */
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
                value += count(startNode.children[i]);
            }
        }
        return value;
    }

    public int distinct(String key) {
        Node node = traverseTo(key);
        return distinct(node);
    }

    private int distinct(Node startNode) {
        if (startNode == null) return 0;
        int numWords = 0;
        if (startNode.value > 0)
            numWords++;
        for (int i = 0; i < NUMBER_OF_BRANCHES; i++) {
            numWords += distinct(startNode.children[i]);
        }
        return numWords;
    }

    public Iterator iterator() {
        return new BinaryTreeIterator();
    }

    /**
     * INNER CLASS NODE //TODO Descprition
     */
    private class Node {
        int value = 0;
        Node[] children = new Node[NUMBER_OF_BRANCHES];
    }

    private class BinaryTreeIterator<String, Integer> implements Iterator<Map.Entry<String, Integer>> {

        private int currentIndex = 0;


        public boolean hasNext() {
            return numberOfElements > currentIndex;
        }

        public Map.Entry<String, Integer> next() {

            return null;
        }

        public void remove() {/*No implementation cause it sux B-) */}
    }

}
