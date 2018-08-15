package sword_finger_offer;
/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    /**
     * @describe 运行时间：11ms 占用内存：9440k  最后一个点为根节点，前面肯定会有一个一个序列都比这个数小，
     *                                     有一个序列都比这个数大，进行循环比较，最后的下标只要到达要比较的根节点就说明是后序遍历
     * @param sequence
     * @return
     */
//    public boolean verifySquenceOfBST(int[] sequence) {
//		if (sequence.length == 0) {
//			return false;
//		}
//		int root = sequence.length-1;
//		int i = 0;
//    	while (root > 0) {
//    		i = 0;
//    		while (sequence[i++] < sequence[root]);
//    		while (sequence[i++] > sequence[root]);
//    		if (i < root) {
//    			return false;
//    		}
//    		root--;
//    	}
//    	return true;
//        
//    }
	/**
	 * @describe 递归解法，思路与非递归相同。
	 * @param sequence
	 * @return
	 */
	public boolean verifySequenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		return judge(sequence, 0, sequence.length - 1);
	}

	private boolean judge(int[] sequence, int first, int last) {
		// TODO Auto-generated method stub
		if (first >= last) {
			return true;
		}
		int i = last-1;
		while (i >= first && sequence[i--] > sequence[last]);
		for (int j = i; j >= first; j--) {
			if (sequence[j] > sequence[last]) {
				return false;
			}
		}
		return judge(sequence, first, i+1) && judge(sequence, i+2, last-1);
	}
	  
}
