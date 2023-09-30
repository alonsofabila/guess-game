package src;

import java.util.Scanner;

public class YesNoGame {

    private Node root;

    public YesNoGame(){
        root = new Node("Is it a living thing?");
        root.left = new Node("Is it a plant?");
        root.right = new Node("Is it something man-made?");
        root.left.left = new Node("Is it a flower?");
        root.left.right = new Node("Is it a tree?");
        root.right.left = new Node("Is it electronic?");
        root.right.right = new Node("Is it a tool?");
        root.left.left.left = new Node("Rose");
        root.left.left.right = new Node("Sunflower");
        root.left.right.left = new Node("Oak Tree");
        root.left.right.right = new Node("Maple Tree");
        root.right.left.left = new Node("Computer");
        root.right.left.right = new Node("Television");
        root.right.right.left = new Node("Hammer");
        root.right.right.right = new Node("Scissors");
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

    public void playGame() {
        Node currentNode = root;
        Scanner scanner = new Scanner(System.in);

        while (currentNode.left != null) {
            System.out.println(currentNode.data);
            String response = scanner.nextLine().toLowerCase().trim();
            if (response.equals("yes")) {
                currentNode = currentNode.left;
            } else if (response.equals("no")) {
                currentNode = currentNode.right;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }

        System.out.println("Is it a " + currentNode.data + "?");
        String finalResponse = scanner.nextLine().toLowerCase().trim();
        if (finalResponse.equals("yes")) {
            System.out.println("I guessed it!");
        } else {
            System.out.println("I give up. What is it?");
            String newObject = scanner.nextLine();
        }
    }

}
