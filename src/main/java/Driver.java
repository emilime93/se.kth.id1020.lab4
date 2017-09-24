public class Driver {

    public static void main(String[] args) {

        System.out.println((int) 'a');

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
    }

}
