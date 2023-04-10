
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.*;

public class TreeCreator {
    public static Tree createTree(String treePath) {
        try {
            File treeData = new File("src/" + treePath);
            Scanner reader = new Scanner(treeData);
            int treeSize = parseInt(reader.nextLine());
            Tree tree = new Tree(parseInt(reader.nextLine()));
            treeSize--;
            while(treeSize>0) {
                int value = parseInt(reader.nextLine());
                int parent = parseInt(reader.nextLine());
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
