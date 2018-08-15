package sword_finger_offer;

import java.util.ArrayList;

import utils.TreeNode;

/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *           路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPath {
	
	/**
	 * @describe 运行时间：23ms  占用内存：8852k 费尽千辛万苦…… 递归，将累加得到目标值的数组放入总数组
	 * @param root
	 * @param target
	 * @return
	 */
//	ArrayList<ArrayList<Integer>> arrayAll = new ArrayList<ArrayList<Integer>>();
//    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
//    	if (root == null) {
//    		return arrayAll;
//    	}
//    	ArrayList<Integer> array = new ArrayList<Integer>();
//    	accumulation(array, root, target);
//    	return arrayAll;
//    }
//	private void accumulation(ArrayList<Integer> array, TreeNode root,
//			int target) {
//		if (target-root.val == 0 && root.right == null && root.left == null) {
//			array.add(root.val);
//			arrayAll.add(new ArrayList<Integer>(array));//新new一个数组，不新new的话，地址引用会一直不变，内存中的值会一直被改变
//		} else if (target-root.val > 0) {
//			array.add(root.val);
//	    	target -= root.val;
//	    	if (root.left != null) {
//	        	accumulation(array, root.left, target);
//	    	}
//	    	if (root.right != null) {
//	    		accumulation(array, root.right, target);
//	    	}
//		}
//		if (!array.isEmpty()) {
//			array.remove(array.size()-1);//进行回退，不会退的话，访问过的元素都会存在在数组中
//		}
//		
//	}
	
	
	
	/**
	 * @describe 大神极简思想与代码，思想大致相同
	 * @param root
	 * @param target
	 * @return
	 */
	ArrayList<ArrayList<Integer>> arrayAll = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> array = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
		if (root == null) {
			return arrayAll;
		}
		array.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			arrayAll.add(new ArrayList<Integer>(array));
		}
		findPath(root.left, target);
		findPath(root.right, target);
		array.remove(array.size()-1);
		return arrayAll;
	}
}
