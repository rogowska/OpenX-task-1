public class Node {
    int value;
    Node parent;


    public Node(int value){
        this.value = value;
        this.parent = null;
    }

    public Node(int value, Node parent){
        this.value = value;
        this.parent = parent;

    }

}


