public class Tree {

   private Node root;
    private int size;

    public Tree(int value){
       root = new Node(value);
       size = 1;
    }

    //print preorder
    private void print(Node node){
        System.out.println(node.value);
        if(node.left != null)
            print(node.left);
        if (node.right != null)
            print(node.right);
    }

    public void print(){
        print(root);
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


}