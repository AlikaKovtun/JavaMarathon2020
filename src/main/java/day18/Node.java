package day18;

public class Node {
    private int value;
    private Node sonLeft;
    private Node sonRight;

    public Node(int value) {
        this.value = value;
    }


    public static void addNode(Node root, int number) {
        if (number < root.value) {
            if (root.sonLeft == null)
                root.sonLeft = new Node(number);
            else
                addNode(root.sonLeft, number);
        } else {
            if (root.sonRight == null)
                root.sonRight = new Node(number);
            else
                addNode(root.sonRight, number);
        }
    }

    public static void dfs(Node root) {

        if (root != null) {
            dfs(root.sonLeft);
            System.out.print(" " + root.value);
            dfs(root.sonRight);
        }
    }
}
