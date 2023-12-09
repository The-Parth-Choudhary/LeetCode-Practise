package Trees;

import java.util.*;

public class Q297 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        s(root, sb);

        return sb.toString();
    }

    private void s(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");

        s(root.left, sb);
        s(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));

        TreeNode root = d(queue);

        return root;
    }

    private TreeNode d(Queue<String> queue) {
        String val = queue.remove();

        if (val.equals("#")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = d(queue);
        node.right = d(queue);

        return node;
    }
}
