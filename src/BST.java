/**
 *
 * @author ertugrul
 */
class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

class BinarySearchTree {

    Node root;
    Node tempNode;

    public BinarySearchTree() {
        this.root = null;
    }

    boolean insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return true;
        }

        tempNode = root;
        while (true) {

            if (newNode.data == tempNode.data) {
                return false;
            }
            // For left
            if (newNode.data < tempNode.data) {
                if (tempNode.left == null) {
                    tempNode.left = newNode;
                    return true;
                } else {
                    tempNode = tempNode.left;
                }
                // For Right       
            } else {
                if (tempNode.right == null) {
                    tempNode.right = newNode;
                    return true;
                } else {
                    tempNode = tempNode.right;
                }
            }
        }
    }
    
    boolean contains(int data){
        
        Node searchNode = this.root;
        
        
        if (data == searchNode.data ){
            return true;
        }
        
        while (true) {            
            if (data < searchNode.data) {
                if (data == searchNode.data) {
                    return true;
                } else {
                    searchNode = searchNode.left;
                    if (searchNode == null) {
                        return false;
                    }
                }
                
            } else {
                if (data == searchNode.data) {
                    return true;
                } else {
                    searchNode = searchNode.right;
                    if (searchNode == null) {
                        return false;
                    }
                }
            }
        }
        
       
    }
}
    


public class BST {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(15);    
        bst.insert(35);
        bst.insert(85);
        
        
        System.out.println(bst.root.data);
        
        bst.contains(18);
        
    }

}
