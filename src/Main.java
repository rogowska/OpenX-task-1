public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(7);
        Tree tree2 = new Tree(7);
        tree.insert(6,  7);
        tree.insert(5, 7);
        tree.insert(1, 5);
        tree.insert(2, 6);
        tree.insert(9, 5);


        tree2.insert(6,  7);
        tree2.insert(5, 7);
        tree2.insert(1, 5);
        tree2.insert(3, 6);
        tree2.insert(9, 5);
        System.out.println(tree.ifEqual(tree2));
    }
}