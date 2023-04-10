
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertSpec {

    //only root
    @Test
    public void a(){
        Tree tree = new Tree(1);
        boolean inserted = tree.insert(4,1);
        assertTrue(inserted);
    }

    //two same parents
    @Test
    public void b(){
        Tree tree = CreateTree.createTree("test/resources/InsertTests.txt");
        boolean inserted = tree.insert(1, 6);
        //assertTrue(inserted);
        assertEquals("7 6 1 6 ", tree.print());
    }

    //no parent
    @Test
    public void c(){
        Tree tree = CreateTree.createTree("test/resources/InsertTests.txt");
        boolean inserted = tree.insert(1, 8);
        assertFalse(inserted);
    }

    //parent with no null children
    @Test
    public void d(){
        Tree tree = CreateTree.createTree("test/resources/InsertTests.txt");
        boolean inserted = tree.insert(1, 7);
        assertFalse(inserted);
    }
}
