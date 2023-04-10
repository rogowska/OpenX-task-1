
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CreateTree {

        public static Tree createTree(String treePath) {
            try {
                File treeData = new File("src/" + treePath);
                Scanner reader = new Scanner(treeData);
                Integer treeSize = Integer.parseInt(reader.nextLine());
                Tree tree = new Tree(Integer.parseInt(reader.nextLine()));
                treeSize--;
                while(treeSize>0) {
                    Integer value = Integer.parseInt(reader.nextLine());
                    Integer parent = Integer.parseInt(reader.nextLine());
                    tree.insert(value,parent);
                    treeSize --;

                }
                reader.close();
                return tree;
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            return new Tree(-1);
        }
        public static void test(Tree tree, Tree tree2) {
            System.out.println("Test run:");
            System.out.println("main.Tree.print:");tree.print();
            System.out.println("main.Tree.howDeep:" + tree.howDeep());
            System.out.println("main.Tree.leafCount:" + tree.leafCount());
            System.out.println("main.Tree.print:");tree.print();
            System.out.println("Tree2.howDeep:" + tree2.howDeep());
            System.out.println("Tree2.leafCount:" + tree2.leafCount());

            System.out.println("If tree equal tree2:" + tree.ifEqual(tree2));
            System.out.println();
        }

}
