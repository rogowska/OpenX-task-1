import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IfEqualSpec {

    @Test
    public void shouldBeEqualIfTreesAreEqual(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest1.txt");

        boolean equal = tree.equals(tree2);
        assertTrue(equal);
    }
    @Test
    public void shouldNotBeEqualIfTreesHaveDifferentSizes(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest2.txt");

        boolean equal = tree.equals(tree2);
        assertFalse(equal);
    }

    @Test
    public void shouldNotBeEqualIfTreesHaveNotEqualNodes(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest1.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest3.txt");

        boolean equal = tree.equals(tree2);
        assertFalse(equal);
    }

    @Test
    public void shouldNotBeEqualIfTreesAreBuildDifferently(){
        Tree tree = TreeCreator.createTree("test/resources/EqualTest4.txt");
        Tree tree2 = TreeCreator.createTree("test/resources/EqualTest5.txt");

        boolean equal = tree.equals(tree2);
        assertFalse(equal);
    }
}
