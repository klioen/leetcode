tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        else
            return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode p, TreeNode q) {
        if(p == null && q == null) 
            return true;
        else if(p == null || q == null)
            return false;
        else
            return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
