package DEC20Review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GeneralTreeBFS {
    public static void main(String[] args) {
        // Create the tree nodes
        TreeNode root = new TreeNode("1");
        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");
        TreeNode node4 = new TreeNode("4");
        TreeNode node5 = new TreeNode("5");
        TreeNode node6 = new TreeNode("6");

        // Build the tree structure
        root.addChildren(node2);
        root.addChildren(node3);
        node2.addChildren(node4);
        node2.addChildren(node5);
        node3.addChildren(node6);

        // Perform BFS on the tree starting from the root node
        System.out.println("BFS Traversal:");
        bfs(root);
    }

    private static void bfs(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.name + " ");
            queue.addAll(node.children);
        }
    }
}
