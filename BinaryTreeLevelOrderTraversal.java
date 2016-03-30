tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> line = new ArrayList<Integer>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node == null) {
                result.add(new ArrayList<Integer>(line));                        
                line.clear();
                if(queue.isEmpty())
                    break;
                else {
                    queue.offer(null);
                    continue;    
                }
            }
            line.add(node.val);
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
            
        }
        return result;
    }
}
