package binaryTree;

public class BinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public void insert(Node node, Node head) {
        if (node.value > head.value) {
            if (head.right == null) {
                head.right = node;
            } else {
                insert(node, head.right);
            }
        } else {
            if (head.left == null) {
                head.left = node;
            } else {
                insert(node, head.left);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    public void search(Node node, int value) {
        if (node.value == value) {
            System.out.println("FOUND IN TREE : " + value);
            return;
        }
        if (value > node.value) {
            search(node.right, value);
        } else {
            search(node.left, value);
        }
    }

    public void search(Node node, int value, int level) {
        level += 1;
        if (node.value == value) {
            System.out.println("FOUND THE VALUE '" + value + "' ON " + level + " level!");
            return;
        }
        if (value > node.value) {
            search(node.right, value, level);
        } else {
            search(node.left, value, level);
        }
    }

    public static void main(String[] args) {

        int target = 2;
        BinaryTree tree = new BinaryTree();
        Node root = new Node(5);
        int[] arr = new int[12];
        for (int index = 0; index < 12; index = index + 2) {
            tree.insert(new Node(index), root);
            arr[index] = index;
        }
        tree.traverseInOrder(root);
        System.out.println();
        long startTime = System.currentTimeMillis();
        tree.search(root, target, 0);

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                System.out.println("FOUND IN ARRAY : " + target);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");
    }
}
