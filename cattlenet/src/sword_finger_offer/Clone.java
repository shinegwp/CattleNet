package sword_finger_offer;

import utils.RandomListNode;

public class Clone {
    /**
     * @describe 运行时间：17ms 占用内存：9672k 就是简单的复制。
     * @param pHead
     * @return
     */
//	public RandomListNode clone(RandomListNode pHead){
//		if (pHead == null) {
//			return pHead;
//		}
//		RandomListNode head = new RandomListNode(pHead.label);
//		RandomListNode current = pHead;
//		RandomListNode result = head;
//		while (current != null) {
//			if (current.next != null) {
//				result.next = new RandomListNode(current.next.label);
//			}
//			if (current.random != null) {
//				result.random = new RandomListNode(current.random.label);
//			}
//			result = result.next;
//			current = current.next;	
//		}
//		return head;
//    }
	/**
	 * @describe 通过大神的python递归改写
	 * @param pHead
	 * @return
	 */
	public RandomListNode clone(RandomListNode pHead){
		if (pHead == null) {
			return null;
		}
		RandomListNode head = new RandomListNode(pHead.label);
		if (pHead.random != null) {
			head.random = new RandomListNode(pHead.random.label);
		}
		head.next = clone(pHead.next);
		return head;
	}
}
