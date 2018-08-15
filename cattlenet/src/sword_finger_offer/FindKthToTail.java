package sword_finger_offer;

/**
 * @time 18.4.4
 * @author 高位鹏
 * @describe 输入一个链表，输出该链表中倒数第k个结点。
 *           运行时间：16ms
 *           占用内存：9692k
 */
import utils.ListNode;

public class FindKthToTail {
	/**
	 * @describe  思想已是最简，该题与微软笔试题判断链表是否有环思路相同，设置两个指针，指针相隔一定的距离。代码仍需简化。
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode findKthToTail(ListNode head, int k) {
		if (head != null) {
			ListNode front = head;
			ListNode behind = head;
			int i = 1;
			while (front.next != null) {
				front = front.next;
				if (i >= k) {
					behind = behind.next;
				}
				i++;
			}
			if (i > k) {
				return behind.next;
			} else if (i == k) {
				return head;
			} else {
				return null;
			}
		}
		return head;
	}
}
