import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeafCountSpec {

    @Test
    public void shouldCountLeavesForTreeWithRootOnly() {
        Tree tree = new Tree(1);

        int leafs = tree.leafCount();
        assertEquals(1, leafs);
    }

    @Test
    public void shouldCountLeavesForTreeWithOnlyOneChild() {
        Tree tree = TreeCreator.createTree("test/resources/LeafTest.txt");

        int leafs = tree.leafCount();
        assertEquals(1, leafs);
    }

    @Test
    public void shouldCountLeavesForTree() {
        Tree tree = TreeCreator.createTree("test/resources/LeafTest2.txt");

        int leafs = tree.leafCount();
        assertEquals(4, leafs);
    }

    @Test
    public void shouldCountLeavesForTwoSingleSubtrees() {
        Tree tree = TreeCreator.createTree("test/resources/LeafTest3.txt");

        int leafs = tree.leafCount();
        assertEquals(2, leafs);
    }
}
