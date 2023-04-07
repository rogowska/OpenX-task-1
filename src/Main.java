public class Main {
    public static void main(String[] args) {
        Tree newTree = new Tree(1, 10);
        newTree.insert(5);
        newTree.insert(4);
        newTree.insert(8);
        newTree.insert(5);
        newTree.insert(9, 0);
        newTree.print();
    }
}