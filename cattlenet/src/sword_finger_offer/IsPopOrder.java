package sword_finger_offer;

import java.util.Stack;

/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 *           序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class IsPopOrder {
	/**
	 * @describe 运行时间：19ms 占用内存：8592k  思路还是有点混乱，不够清晰
	 * @param pushA
	 * @param popA
	 * @return
	 */
//	public boolean isPopOrder(int [] pushA,int [] popA) {
//		Stack<Integer> stack = new Stack<Integer>();
//		int index = 0;
//		int i = 0;
//		while (index < popA.length) {
//			while (i < pushA.length && popA[index] != pushA[i]) {//将当前出栈元素之前的元素全部放入栈
//				stack.push(pushA[i++]);
//			}
//			if (i < pushA.length && pushA[i] == popA[index]) {//获取到出栈元素，不放入栈，接着比较下一个出栈的元素
//				index++;
//				i++;
//				while (index < popA.length && popA[index] == stack.peek()) {//当出栈元素已经在栈顶时将元素弹出栈
//					index++;
//					stack.pop();
//				}
//			} else {//没有匹配到当前栈元素，返回false
//				return false;
//			}
//		}
//		return stack.isEmpty() && i == pushA.length;
//	      
//    }
	/**
	 * @describe 大神简介思路
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean isPopOrder(int [] pushA,int [] popA){
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		for (int i = 0, length = pushA.length; i < length; i++) {
			stack.push(pushA[i]);
			while (!stack.empty() && popA[index] == stack.peek()) {
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}
}
