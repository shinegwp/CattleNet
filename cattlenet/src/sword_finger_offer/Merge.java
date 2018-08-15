package sword_finger_offer;
/**
 * @time 18.4.4
 * @author 高位鹏
 * @describe 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *           运行时间：15ms
 *           占用内存：9340k
 */
import utils.ListNode;

public class Merge {
	/**
	 * @describe 
	 * @param list1
	 * @param list2
	 * @return
	 */
//    public ListNode merge(ListNode list1,ListNode list2) {
//    	if (list1 == null) {
//    		return list2;
//    	} else if (list2 == null) {
//    		return list1;
//    	} else if (list1.val >= list2.val) {
//    		ListNode temp = list2, temp1 = null;
//    		while (temp.next != null) {
//    			if (list1.val < temp.next.val && list1 != null) {
//    				temp1 = list1;
//    				list1 = list1.next;
//    				temp1.next = temp.next;
//    				temp.next = temp1;
//    			}
//    			temp = temp.next;
//    		}
//    		if (list1 != null) {
//    			temp.next = list1;
//    		}
//    		return list2;
//    	} else {
//    		ListNode temp = list1, temp2 = null;
//    		while (temp.next != null) {
//    		    if (list2.val < temp.next.val && list2 != null) {
//    				temp2 = list2;
//    				list2 = list2.next;
//    				temp2.next = temp.next;
//    				temp.next = temp2;
//    			}
//    			temp = temp.next;
//    		}
//    		if (list2 != null) {
//    			temp.next = list2;
//    		}
//    		return list1;
//    	}
//    }
	/**
	 * @describe 递归版本，效率要低。但是代码简洁
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode merge(ListNode list1,ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else {
			if (list1.val <= list2.val) {
				list1.next = merge(list1.next,list2);
				return list1;
			} else {
				list2 = merge(list1,list2.next);
				return list2;
			}
		}
	}
    
    
}
