public class Tree {

   private Node root;
    private int size;

    public Tree(int value){
       root = new Node(value);
       size = 1;
    }

    //print preorder
    private void print(Node node){
        System.out.print(node.value + " ");
        if(node.left != null)
            print(node.left);
        if (node.right != null)
            print(node.right);
    }

    public void print(){
        print(root);
        System.out.println();
    }


    //insert returns if succeeded
    private boolean insert(Node node, int value, int parentValue){
        if(node.value == parentValue){
            if(node.left == null){
                Node nodeNew = new Node(value);
                node.left = nodeNew;
                return true;
            }
            else if(node.right == null){
                Node nodeNew = new Node(value);
                node.right = nodeNew;
                return true;
            }

            }
        if(node.left != null)
            insert(node.left, value, parentValue);
        if (node.right != null)
            insert(node.right, value, parentValue);

        return false;
    }

   public boolean insert(int value, int parentValue){
        return insert(root, value, parentValue);
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