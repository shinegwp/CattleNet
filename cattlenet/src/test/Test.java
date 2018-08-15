package test;

import java.util.ArrayList;

import sword_finger_offer.Fibonacci;
import sword_finger_offer.FindPath;
import sword_finger_offer.IsPopOrder;
import sword_finger_offer.JumpFloor;
import sword_finger_offer.NumberOf1;
import sword_finger_offer.PrintFromTopToBottom;
import sword_finger_offer.PrintMatrix;
import sword_finger_offer.RepalceSpaces;
import utils.TreeNode;

public class Test {
	int x;
	static String s;

	static int xx;

	public static void main(String[] args) {
		// new Test().madd();
		// RepalceSpaces rs = new RepalceSpaces();
		// StringBuffer sb = new StringBuffer("we are fammily ");
		// System.out.println(rs.replaceSpace(sb));
//		Fibonacci f = new Fibonacci();
//        for(int i = 0; i < 10; i++){
//        	System.out.println(f.fibonacci1(i));
//        }
//		JumpFloor jf = new JumpFloor();
//		int i = 10;
//		while(i-->0){
//			System.out.println(jf.jumpFloor(i));
//		}
		
//		NumberOf1 no = new NumberOf1();
//		System.out.println(no.numberOf1(-4));
//		System.out.println(8&7);
//		
//
//		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
//				{ 13, 14, 15, 16 } };
//		ArrayList<Integer> l = new PrintMatrix().printMatrix(a);
//		for (int i : l) {
//			System.out.println(i);
//		}
//		int[] a = {1,2,3,4,5};
//		int[] b = {5,4,3,2,1};
//		int[] c = {4,2,5,3,1};
//		int[] d = {4,3,5,2,1};
//		IsPopOrder is = new IsPopOrder();
//		System.out.println(is.isPopOrder(a, d));
//		System.out.println(is.isPopOrder(a, b));
//		System.out.println(is.isPopOrder(a, c));
		//findPath
//		TreeNode root = new TreeNode(0);
//		PrintFromTopToBottom printFromTopToBottom = new PrintFromTopToBottom();
//		ArrayList<Integer> list = printFromTopToBottom.printFromTopToBottom(root);
//		for (int i : list) {
//			System.out.println(i);
//		}
		FindPath fp = new FindPath();
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);
		for (ArrayList<Integer> array : fp.findPath(root, 22)) {
			for (int i : array) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	// public void madd() {
	// // TODO Auto-generated method stub
	// String ss ;
	// int xxx = 0;
	// System.out.println(x+" "+xx+s+xxx);
	// }

}
