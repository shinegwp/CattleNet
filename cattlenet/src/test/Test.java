package test;

import sword_finger_offer.Fibonacci;
import sword_finger_offer.JumpFloor;
import sword_finger_offer.RepalceSpaces;

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
		JumpFloor jf = new JumpFloor();
		int i = 10;
		while(i-->0){
			System.out.println(jf.jumpFloor(i));
		}
		

	}
	// public void madd() {
	// // TODO Auto-generated method stub
	// String ss ;
	// int xxx = 0;
	// System.out.println(x+" "+xx+s+xxx);
	// }

}
