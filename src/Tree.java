import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tree {

    private ArrayList<Integer> tree;
    private int size;


    public Tree(int value, int capacity){
        tree = new ArrayList<Integer>(capacity);
        this.tree.add(0, value);
        this.size = 1;
    }

    public void insert(int value, int parentIndex){
        insert(value);
        int currentIndex = size - 1;
        int secondIndex;
        while ((findParentIndex(currentIndex) != parentIndex) && currentIndex != 0){
            secondIndex = currentIndex;
            currentIndex = findParentIndex(currentIndex);
            Collections.swap(this.tree, currentIndex, secondIndex);
        }

    }

     public void insert(int value){
        this.tree.add(size, value);
        this.size++;

     }

     public void print(){
        for(Integer x: this.tree){
            System.out.println(x);
        }
     }

     private int findParentIndex(int i){
         return (i - 1) / 2;
     }

     private int findLeftChildIndex(int i){
        return 0;
     }

     private int findRightChildIndex(int i){
        return 0;
     }



}