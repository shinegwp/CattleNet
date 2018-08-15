package sword_finger_offer;

import utils.ListNode;

/**
 * @time 18.4.4
 * @author 高位鹏
 * @describe 输入一个链表，反转链表后，输出链表的所有元素。
 *           
 */
public class ReverseList {
	/**
	 * @describe 思想有冗余，多了一个结点！运行时间：25ms  占用内存：9048k;
	 * @param head
	 * @return
	 */
//	public ListNode reverseList(ListNode head) {
//		if (head != null && head.next != null) {
//			ListNode first = head, move = head, temp = head;
//			while (move.next != null) {
//				temp = move.next;
//				move.next = temp.next;
//				temp.next = first;
//				first = temp;
//				temp = move;
//			}
//			return first;
//		}
//		return head;
//    }
	/**
	 * @describe  大神最简思想：根据代码动手画画秒懂
	 * @param head
	 * @return
	 */
	public ListNode ReverseList(ListNode head) {
		
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
		}
		return pre;
	}
}
