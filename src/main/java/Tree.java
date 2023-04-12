public class Tree {

   private Node root;
    private int size;

    public Tree(int value){
       root = new Node(value);
       size = 1;
    }

    private String getPreorder(Node node, String preOrder){
        preOrder = preOrder + node.value + " ";
        if(node.left != null)
            preOrder = getPreorder(node.left, preOrder);
        if (node.right != null)
            preOrder = getPreorder(node.right, preOrder);
        return preOrder;
    }

    public String getPreorder(){
        return getPreorder(root, "");
    }

    private Node findParent(Node node, int parentValue){
        Node parent = null;

        if(node.value == parentValue && (node.left == null || node.right == null))
            parent = node;
        if(parent == null && node.left != null)
            parent = findParent(node.left, parentValue);
        if(parent == null && node.right != null)
            parent = findParent(node.right, parentValue);

        return parent;
    }

    private boolean insert(Node node, int value){
        boolean inserted = false;

        if(node.left == null){
            node.left = new Node(value);
            size++;
            inserted = true;
        }
        else if(node.right == null){
            node.right = new Node(value);
            size++;
            inserted = true;
        }
        return inserted;
    }

   public boolean insert(int value, int parentValue){
        boolean inserted = false;
        Node parent = findParent(root, parentValue);
        if(parent != null){
            inserted = insert(parent, value);
        }
        return inserted;
   }

   private int leafCount(Node node){
        if(node == null)
           return 0;
        if(node.right == null && node.left == null)
           return 1;
        else
           return leafCount(node.left) + leafCount(node.right);
   }

   public int leafCount(){
        return leafCount(root);
   }


   private int getMaxPathLenght(Node node){
        int edges = 0;
        if( node != null)
            edges = Math.max(getMaxPathLenght(node.left), getMaxPathLenght(node.right)) + 1;
        return edges;
   }

    public int getMaxPathLenght(){
        return getMaxPathLenght(root) - 1;
    }


   private boolean isEqual(Node node, Node node2){
        boolean equal = false;
        if(node == null && node2 == null)
            equal = true;
        else if(node.value == node2.value)
            equal = isEqual(node.left, node2.left) & isEqual(node.right, node2.right);
        return equal;
   }

    public boolean isEqual(Tree secondTree){
        boolean equal = false;
        if(this.size == secondTree.size)
            equal = isEqual(root, secondTree.root);
        return equal;
    }

}