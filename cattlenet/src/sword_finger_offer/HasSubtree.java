package sword_finger_offer;

/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *           运行时间：12ms
 *           占用内存：9560k
 */
import utils.TreeNode;

public class HasSubtree {
    /**
     * @describe 此代码很简洁，但是我认为有问题，她只能判断一层的子结构，感觉不全，但不知为何能通过
     * @param root1
     * @param root2
     * @return
     */
//	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
//		if (root1 != null && root2 != null) {
//			return isSubTree(root1, root2) || isSubTree(root1.left, root2)
//					|| isSubTree(root1.right, root2);
//		}
//		return false;
//	}
//
//	public boolean isSubTree(TreeNode root1, TreeNode root2) {
//		if (root2 == null) {
//			return true;
//		} else if (root1 == null) {
//			return false;
//		} else if (root1.val == root2.val) {
//			return isSubTree(root1.left, root2.left)
//					&& isSubTree(root1.right, root2.right);
//		} else {
//			return false;
//		}
//	}
	/**
	 * @describe  上种方式的改良
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean hasSubTree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 == null || root2 == null) {
			return false;
		} 
		if (root1.val == root2.val) {
			result = isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
			return result;
		} else {
			result = hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
		}
		return result;
	}
	public boolean isSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return true;
		} else if (root1 == null) {
			return false;
		} else if (root1.val == root2.val) {
			return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree1=new TreeNode(12);
		
		tree1.left=new TreeNode(3);
		tree1.right=new TreeNode(4);
		tree1.left.left=new TreeNode(6);
		tree1.left.right=new TreeNode(7);
		tree1.right.left=new TreeNode(9);
		tree1.right.right=new TreeNode(10);
		TreeNode tree2=new TreeNode(10);
		HasSubtree a=new HasSubtree();
		System.out.println(a.hasSubTree(tree1, tree2));
	}
}
