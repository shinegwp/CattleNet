package sword_finger_offer;

import java.util.ArrayList;

import utils.ListNode;

/**
 * @time 18.4.13
 * @author 高位鹏
 * @describe 输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNode {
	/**
	 * @describe  思路1超时
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
//	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//		if (pHead1 == null || pHead2 == null) {
//			return null;
//		}
//		ListNode head1 = pHead1, head2 = pHead2;
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		while (head1 != null) {
//			arr1.add(head1.val);
//			head1 = head1.next;
//		}
//		while (head2 != null) {
//			arr1.add(head2.val);
//			head1 = head2.next;
//		}
//		int count1 = 0, count2 = 0;
//		for (int i1 = arr1.size()-1, i2 = arr2.size()-1; i1>=0 && i2>=0; i1++, i2++) {
//			if (arr1.get(i1) != arr2.get(i2)) {
//				count1 = i1;
//				count2 = i2;
//			}
//		}
//		if (count1 == arr1.size()-1) {
//			return null;
//		} else if (count1 <= count2) {
//			while (count1 != 0) {
//				pHead1 = pHead1.next;
//				count1--;
//			}
//			return new ListNode(pHead1.val);
//		} else {
//			while (count1 != 0) {
//				pHead1 = pHead1.next;
//				count1--;
//			}
//			return new ListNode(pHead2.val);
//		}
	/**
	 * @describe 不容易…… 运行时间：29ms 占用内存：8872k 思路：首先对属于1链表的结点进行标记。然后复制一份2链表。
	 *                                               遍历愿2链表，同时复制2链表指针一起移动，当遍历到属于1链表的结点，返回复制2链表的指针
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
//	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//		if (pHead1 == null || pHead2 == null) {
//			return null;
//		}
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		ListNode copy = new ListNode(pHead2.val);
//		ListNode copy1 = copy, head2 = pHead2;
//		while (head2.next != null) {
//			copy1.next = new ListNode(head2.next.val);
//			copy1 = copy1.next;
//			head2 = head2.next;
//		}
//		while (pHead1 != null) {
//			arr.add(pHead1.val);
//			pHead1.val = -1;
//			pHead1 = pHead1.next;
//		}
//		while (pHead2 != null) {
//			if (pHead2.val == -1) {
//				return copy;
//			}
//			copy = copy.next;
//			pHead2 = pHead2.next;
//		}
//		return null;
//		
//    }
	/**
	 * @describe 大神思想：若长度相同有公共结点，则第一次遍历就返回公共结点，若长度相同无公共结点，则第一次循环到末尾，返回null
	 *                  若长度不同有公共节点，则第一次遍历完两个链表会形成链表长度差，第二次遍历就形成了长度相同的结点
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode head1 = pHead1, head2 = pHead2;
		while (head1 != head2) {
			head1 = head1 == null ? pHead1 : head1.next;
			head2 = head2 == null ? pHead2 : head2.next;
		}
		return head1;
	}
}
