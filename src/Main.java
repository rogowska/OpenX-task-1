public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(7);
        tree.insert(6,  7);
        tree.insert(5, 7);
        tree.insert(1, 5);
        tree.insert(2, 6);
        tree.insert(9, 5);
        tree.print();
    }
}