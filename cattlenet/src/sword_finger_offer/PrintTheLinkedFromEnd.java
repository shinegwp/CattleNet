package sword_finger_offer;

import java.util.ArrayList;
import java.util.Stack;

import utils.ListNode;

/**
 * @time 3.28
 * @author 高位鹏
 * @describe 输入一个链表，从尾到头打印链表每个节点的值。 
 *           运行时间：20ms
 * 
 *           占用内存：8872k
 */
public class PrintTheLinkedFromEnd {
	/*
	 * 自己求解，解题思路，利用栈的先进后出原理
	 */
//	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//		ArrayList<Integer> array = new ArrayList<Integer>();
//		Stack<Integer> stack = new Stack<Integer>();
//		while (listNode != null) {
//			stack.add(listNode.val);
//			listNode = listNode.next;
//		}
//		while (!stack.isEmpty()) {
//			array.add(stack.pop());
//		}
//		return array;
//
//	}
	/*
	 * 大神方案一：利用ArrayList 中的 add(int index, E element)方法，将指定的元素插入此列表中的首位置。进行巧妙求解
	 */

//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//    	ArrayList<Integer> arr=new ArrayList<Integer>();
//    	while(listNode!=null){
//    		arr.add(0,listNode.val);//该方法底层首先判断下标是否正常，
//    		                        //然后进行判断是否扩容，
//    		                        //再通过System的本地方法将指定位置之后原数组整体copy向后移一位，
//    		                        //最后在指定位置插入
//    		listNode=listNode.next;
//    		}
//    	return arr; 
//    }
	/*
	 * 大神方案二：利用递归的方式进行求解
	 */
	ArrayList<Integer> array = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		while (listNode != null) {
			printListFromTailToHead(listNode.next);
			array.add(listNode.val);
		}
		return array;
	}
}
