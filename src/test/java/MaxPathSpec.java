import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxPathSpec {

    @Test
    public void shouldTreeWithRootOnlyHaveNoPaths() {
        Tree tree = new Tree(1);

        int edges = tree.getMaxPathLenght();

        assertEquals(0, edges);
    }

    @Test
    public void shouldCountEdgesForTreeWithSubtressOfDifferentStructure() {
        Tree tree = TreeCreator.createTree("test/resources/MaxPathTest.txt");

        int edges = tree.getMaxPathLenght();
        assertEquals(4, edges);
    }

    @Test
    public void shouldCountEdgesForTreeWithSubtreesOfTheSameStructure() {
        Tree tree = TreeCreator.createTree("test/resources/MaxPathTest2.txt");

        int edges = tree.getMaxPathLenght();
        assertEquals(1, edges);
    }

    @Test
    public void shouldCountEdgesForTreeWithOneSubtree() {
        Tree tree = TreeCreator.createTree("test/resources/MaxPathTest3.txt");

        int edges = tree.getMaxPathLenght();
        assertEquals(3, edges);
    }


}
