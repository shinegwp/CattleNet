package sword_finger_offer;

import utils.TreeNode;

/**
 * @time 18.3.28
 * @author 高伟鹏
 * @describe 
 *           输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1
 *           ,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *           运行时间：175ms
 *           占用内存：22288k
 */
public class ReConstructBinaryTree {

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null) {
			return null;
		}
		return getTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}
	private TreeNode getTree(int[] pre, int preStart, int preEnd, int[] in,
			int inStart, int inEnd) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(pre[preStart]);// 头节点
		if (preStart == preEnd || inStart == inEnd) {
			return tree;
		}
		int root = inStart;
		while (in[root] != pre[preStart]) {
			root++;
		}
		int liftLength = root - inStart;// 左子树结点个数
		int rightLength = inEnd - root;// 右子树结点个数
		if (liftLength > 0) {
			tree.left = getTree(pre, preStart + 1, preStart + liftLength, in,
					inStart, root - 1);
		}
		if (rightLength > 0) {
			tree.right = getTree(pre, preStart + liftLength + 1, preEnd, in,
					root + 1, inEnd);
		}
		return tree;
	}
}
