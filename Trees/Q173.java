package Trees;

import java.util.*;

public class Q173 {
    class BSTIterator {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        Stack<TreeNode> st;

        public BSTIterator(TreeNode root) {
            st = new Stack<>();
            fillStack(root);
        }

        public int next() {
            TreeNode node = st.pop();
            fillStack(node.right);
            return node.val;
        }

        public boolean hasNext() {
            return !st.isEmpty();
        }

        private void fillStack(TreeNode node) {
            while (node != null) {
                st.push(node);
                node = node.left;
            }
        }
    }
}
