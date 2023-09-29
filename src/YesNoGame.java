package src;

public class YesNoGame {

    private Node root;

    public YesNoGame(){
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void print(){
        root.print();
    }

}
