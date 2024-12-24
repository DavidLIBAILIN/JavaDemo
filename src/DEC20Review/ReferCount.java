package DEC20Review;

import java.util.*;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

class TreeNode {
    String name;
    boolean isReferred;
    List<TreeNode> children;
    public TreeNode(String name) {
        this.name = name;
        this.isReferred = false;
        this.children = new ArrayList<>();
    }
    public void addChildren(TreeNode child) {
        child.isReferred = true;
        children.add(child);
    }
}

public class ReferCount {

    private static final Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        // Creating Nodes
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode g = new TreeNode("g");
        TreeNode h = new TreeNode("h");
        TreeNode i = new TreeNode("i");

        // Constructing the tree
        a.addChildren(b);
        b.addChildren(c);
        d.addChildren(e);
        d.addChildren(f);
        f.addChildren(g);
        f.addChildren(h);
        f.addChildren(i);

        List<TreeNode> list = Arrays.asList(a, b, c, d, e, f, g, h, i);
        ReferCount referCount = new ReferCount();
        referCount.mostRefers(list, 3);
    }

    public void mostRefers(List<TreeNode> list, int k) {

        for (TreeNode node : list.stream().filter(node -> node.isReferred).toList()) {
            dfs(node);
        }
        // Get the top 3 customers with the most referrals
        List<Map.Entry<String, Integer>> sortedReferralCounts = new ArrayList<>(map.entrySet());
        sortedReferralCounts.sort(Map.Entry.comparingByValue((int1, int2) -> int2 - int1));

        System.out.println("Top 3 customers with the most referrals:");
        for (int i = 0; i < Math.min(k, sortedReferralCounts.size()); i++) {
            Map.Entry<String, Integer> entry = sortedReferralCounts.get(i);
            System.out.println("Customer " + entry.getKey() + " referred " + entry.getValue() + " customers");
        }
    }

    // DFS function to traverse the tree and count referrals
    private int dfs(TreeNode node) {
       if (node == null) return 0;
       int countReferral = node.children.size();
       for (TreeNode child : node.children) {
           countReferral += dfs(child);
       }
       map.put(node.name, countReferral);
       return countReferral;
    }
}

