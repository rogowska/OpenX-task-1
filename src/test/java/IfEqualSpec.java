import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IfEqualSpec {

    @Test
    public void a(){
        Tree tree = new Tree(1);
        boolean inserted = tree.insert(4,1);
        assertTrue(inserted);
    }
}
