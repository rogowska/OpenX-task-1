import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEqualSpec {

    @Test
    public void shouldTheSameTreesBeEqual() {
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest1.txt");

        boolean equal = tree.isEqual(tree2);
        assertTrue(equal);
    }
    @Test
    public void shouldTreesOfDifferentSizesNotBeEqual(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest2.txt");

        boolean equal = tree.isEqual(tree2);
        assertFalse(equal);
    }

    @Test
    public void shouldTreesWithDifferentNodesNotBeEqual(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest3.txt");

        boolean equal = tree.isEqual(tree2);
        assertFalse(equal);
    }

    @Test
    public void shouldTreesWithTheSameValueNodesInDifferentOrderNotBeEqual(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest4.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest5.txt");

        boolean equal = tree.isEqual(tree2);
        assertFalse(equal);
    }
}
