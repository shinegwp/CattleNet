package sword_finger_offer;

import utils.TreeNode;

/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Mirror {
    /**
     * @describe 运行时间：36ms 占用内存：9432k  运用递归，将每个结点的左右字数进行调换
     * @param root
     */
	public void mirror (TreeNode root) {
		if (root != null) {
			swap(root);
			mirror(root.right);
			mirror(root.left);
		}
	}

	private void swap(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}
