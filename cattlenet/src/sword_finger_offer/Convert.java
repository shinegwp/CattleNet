package sword_finger_offer;

import utils.TreeNode;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {
	/**
	 * @describe  自己的思路还是混乱，解不出
	 * @param pRootOfTree
	 * @return
	 */
//    public TreeNode convert(TreeNode pRootOfTree) {
//		if (pRootOfTree == null) {
//			return pRootOfTree;
//		}
//		if (pRootOfTree.left != null) {
//			leftRecursion(pRootOfTree);
//		}
//    	return pRootOfTree;
//        
//    }
//
//	private void leftRecursion(TreeNode pRootOfTree) {
//		// TODO Auto-generated method stub
//		if (pRootOfTree.left.left != null) {
//			leftRecursion(pRootOfTree.left);
//		} else {
//			pRootOfTree.left.right = pRootOfTree;
//		}
//	}
	
	TreeNode temp = null, realHead = null;
	/**
	 * @describe 大神中序遍历递归思路；
	 * @param pRootOfTree
	 * @return
	 */
    public TreeNode convert(TreeNode pRootOfTree) {
		recursion(pRootOfTree);
    	return realHead;
    }
	private void recursion(TreeNode pRootOfTree) {
		// TODO Auto-generated method stub
		if (pRootOfTree == null) {
			return;
		}
		recursion(pRootOfTree.left);//遍历左子树，直到无左子树
		if (realHead == null) {//找到最小值，对结点进行标记
			realHead = pRootOfTree;
			temp = pRootOfTree;
		} else {//递归回退之后，将本结点与前一个结点进行链接
			temp.right = pRootOfTree;
			pRootOfTree.left = temp;
			temp = pRootOfTree;//记录前一个结点
		}
		recursion(pRootOfTree.right);
	}
}
