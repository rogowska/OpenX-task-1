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
        else if(node.left != null)
            parent = findParent(node.left, parentValue);
        else if(node.right != null)
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
    //todo:refactor below
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


   private int howDeep(Node node){
        if(node == null)
            return 0;
        return Math.max(howDeep(node.left),howDeep(node.right)) + 1;
   }

    public int howDeep(){
        return howDeep(root);
    }


   private boolean ifEqual(Node node, Node node2){
        if(node == null && node2 == null)
            return true;
        if(node.value == node2.value)
        return ifEqual(node.left, node2.left) & ifEqual(node.right, node2.right);
        else return false;

   }

    public boolean ifEqual(Tree secondTree){
        boolean result = false;
        if(this.size == secondTree.size)
            result = ifEqual(root, secondTree.root);
        return result;

    }

}