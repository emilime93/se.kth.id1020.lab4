public class Driver {

    public static void main(String[] args) {

        System.out.println((int) 'a');

        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < 4; i++) {
            binaryTree.put("hej");
        }
        for (int i = 0; i < 6; i++) {
            binaryTree.put("joar");
        }
        for (int i = 0; i < 2; i++) {
            binaryTree.put("jos");
        }
        System.out.println("hej: " + binaryTree.getValue("hej"));
        System.out.println("joar: " + binaryTree.getValue("joar"));
        System.out.println("jos: " + binaryTree.getValue("jos"));
        System.out.println("äpple: " + binaryTree.getValue("äpple"));
        System.out.println("j: " + binaryTree.getValue("j"));
    }

}
