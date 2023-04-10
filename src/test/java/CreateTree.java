
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

}
