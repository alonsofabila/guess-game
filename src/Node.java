package src;

public class Node {

    String data;

    //left node wil be yes
    Node left;

    //right node will be no
    Node right;

    public Node(String data){
        this.data = data;
        left = null;
        right = null;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setLeft(Node node) {
        if (left == null){
            this.left = node;
        }
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node node) {
        if (right == null){
            this.right = node;
        }
    }

    public Node getRight() {
        return right;
    }

    /*
    public void printPreOrder(Node node){
        if (node == null){
            return;
        }
        System.out.printf(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    */

    /*
    public void printPostOrder(Node node){
        if (node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.printf(node.data + " ");
    }
    */

    /*
    public void printInOrder(Node node){
        if (node == null){
            return;
        }
        printInOrder(node.left);
        System.out.printf(node.data + " ");
        printInOrder(node.right);
    }
    */

    public String print() {
        return this.print("", true,"");
    }

    public String print(String prefix, boolean isTail, String sb){
        if(right != null){
            right.print(prefix + (isTail ? "|    " : "     "), false, sb);
        }
        System.out.println(prefix + (isTail ? "||-- " : "/--  ") + data);
        if (left != null){
            left.print(prefix+(isTail ? "     " : "|    "), true, sb);
        }
        return sb;
    }

}
