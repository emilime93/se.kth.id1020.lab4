public class Driver {

    public static void main(String[] args) {
        System.out.println("---- test1() ---");
        test1();
        System.out.println("----------------");

        System.out.println("\n\n");

        System.out.println("---- test2() ---");
        test2();
        System.out.println("----------------");
    }

    public static void test2() {
        Trie trie = new Trie();
        trie.put("joar");
        trie.put("bulle");
        trie.put("bus");
        trie.put("buss");

        System.out.println("COUNT \"bu\": " + trie.count("bu"));
        System.out.println("DISTINCT \"bu\": " + trie.distinct("bu"));
    }

    public static void test1() {
        Trie trie = new Trie();
        for (int i = 0; i < 4; i++) {
            trie.put("hej");
        }
        for (int i = 0; i < 6; i++) {
            trie.put("joar");
        }
        for (int i = 0; i < 2; i++) {
            trie.put("jos");
        }
        System.out.println("hej: " + trie.getValue("hej"));
        System.out.println("joar: " + trie.getValue("joar"));
        System.out.println("jos: " + trie.getValue("jos"));
        System.out.println("äpple: " + trie.getValue("äpple"));
        System.out.println("j: " + trie.getValue("j"));

        System.out.println("COUNT \"j\": " + trie.count("j"));
        System.out.println("DISTINCT \"j\": " + trie.distinct("j"));
    }

}
