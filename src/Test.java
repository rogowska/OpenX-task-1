public class Test {

        public static void test(Tree tree, Tree tree2) {
            System.out.println("Test run:");
            System.out.println("Tree.print:");tree.print();
            System.out.println("Tree.howDeep:" + tree.howDeep());
            System.out.println("Tree.leafCount:" + tree.leafCount());
            System.out.println("Tree.print:");tree.print();
            System.out.println("Tree2.howDeep:" + tree2.howDeep());
            System.out.println("Tree2.leafCount:" + tree2.leafCount());

            System.out.println("If tree equal tree2:" + tree.ifEqual(tree2));
            System.out.println();
        }

}
