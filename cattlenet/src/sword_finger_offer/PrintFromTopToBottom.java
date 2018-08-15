package sword_finger_offer;
/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import utils.TreeNode;

public class PrintFromTopToBottom {
    /**
     * @describe 运行时间：13ms 占用内存：9420k
     * @param root
     * @return
     */
    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if (root != null) {
			
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}
			list.add(queue.poll().val);
			while (!queue.isEmpty()) {
				if (queue.peek().left != null) {
					queue.add(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}
				list.add(queue.poll().val);
			}
			return list;
		}
    	return list;
    }
    public static ArrayList<Integer> getTreeNode(TreeNode root){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		arr.add(root.val);
		while(arr!=null) {
			if(root.left!=null) {
				arr.add(root.left.val);
			}
			if(root.right!=null) {
				arr.add(root.right.val);
			}
			result.add(arr.get(0));
			arr.remove(0);
		}
		return result;
	}
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(8);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(4);
		ArrayList s = printFromTopToBottom(root);
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
	}
}
