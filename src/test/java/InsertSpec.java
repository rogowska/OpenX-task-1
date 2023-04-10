
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertSpec {

    public static final String TREE_DATA = "test/resources/InsertTests.txt";


    @Test
    public void shouldInsertNodeToRoot(){
        Tree tree = new Tree(1);
        boolean inserted = tree.insert(4,1);

        assertTrue(inserted);
        assertEquals("1 4 ", tree.getPreorder());
    }

    @Test
    public void shouldInsertNodeToFirstFoundParent(){
        Tree tree = TreeCreator.createTree(TREE_DATA);
        boolean inserted = tree.insert(1, 6);

        assertTrue(inserted);
        assertEquals("7 6 1 6 ", tree.getPreorder());
    }

    @Test
    public void shouldInsertNodeToFirstFreeParent(){
        Tree tree = TreeCreator.createTree(TREE_DATA);
        tree.insert(7, 6);

        boolean inserted = tree.insert(1, 7);
        assertTrue(inserted);
        assertEquals("7 6 7 1 6 ", tree.getPreorder());
    }


    @Test
    public void shouldNotInsertNodeIfNoParentFound(){
        Tree tree = TreeCreator.createTree(TREE_DATA);
        boolean inserted = tree.insert(1, 8);

        assertFalse(inserted);
        assertEquals("7 6 6 ", tree.getPreorder());
    }

    @Test
    public void shouldNotInsertNodeIfNoFreeParentFound(){
        Tree tree = TreeCreator.createTree(TREE_DATA);
        boolean inserted = tree.insert(1, 7);

        assertFalse(inserted);
        assertEquals("7 6 6 ", tree.getPreorder());
    }
}
