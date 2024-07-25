/*
 Level: 🟢🟢🟢
 Status: DONE
 Runtime: 0 ms
 */

void main() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    searchBST(root, 5);
}

public TreeNode searchBST(TreeNode root, int val) {
    if (root == null)
        return null;
    if (root.val == val)
        return root;
    else if (root.val > val)
        return searchBST(root.left, val);
    else
        return searchBST(root.right, val);
}

public static class TreeNode {
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