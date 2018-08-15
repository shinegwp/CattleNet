package sword_finger_offer;

import utils.TreeNode;

/**
 * @time 18.4.21
 * @author 高位鹏
 * @describe 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeDepth {
	
	/**
	 * @describe 递归求解，记录下最大深度。回撤的时候要进行建议，不影响其他分支的计数     运行时间：19ms
                                                                                                                                                                                   占用内存：9528k
	 * @param root
	 * @return
	 */
//	int result = 0;
//	int temp = 0;
//    public int treeDepth(TreeNode root) {
//		if (root == null) {
//			return result;
//		}
//    	temp++;
//    	if (temp > result) {
//    		result = temp;
//    	}
//    	treeDepth(root.left);
//    	if (root.left != null) {
//    		temp--;
//    	}
//    	treeDepth(root.right);
//    	if (root.right != null) {
//    		temp--;
//    	}
//    	return result;
//    }
	/**
	 * @describe  大神的递归
	 * @param root
	 * @return
	 */
//	public int treeDepth(TreeNode root) {
//		return root == null ? 0 : Math.max(treeDepth(root.left)+1, treeDepth(root.right)+1);
//	}
	public int treeDepth(TreeNode root) {

        return 0;
	}
    public static void main(String[] args) {
    	TreeDepth t = new TreeDepth();
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(1);
    	root.left.left = new TreeNode(1);
    	root.right = new TreeNode(1);
    	root.right.left = new TreeNode(1);
    	root.right.right = new TreeNode(1);
    	root.right.right.right = new TreeNode(1);
    	System.out.println(t.treeDepth(root));
	}
}
