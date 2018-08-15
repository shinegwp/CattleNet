package sword_finger_offer;
/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 把只包含素数2、3和5的数称作丑数（Ugly Number）。
 *           例如6、8都是丑数，但14不是，因为它包含因子7。 
 *           习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *           运行时间：23ms 占用内存：9436k
 */
public class GetUglyNumberSolution {
	/**
	 * @describe  修改了N遍还是运行超时；思路：只要一个数可以被2或3或5或他们的组合相除最后得1，则是丑数，奈何复杂度太大；
	 * @param index
	 * @return
	 */
//	public int getUglyNumberSolution(int index) {
//		if (index < 1) {
//			return 0;
//		}
//        int count = 1;
//        int result = 1;
//        int temp = 0;
//        for (int i = 2; count != index; i++) {
//        	temp = i;
//        	temp = getHelper(temp, 2);
//        	temp = getHelper(temp, 3);
//        	temp = getHelper(temp, 5);
//        	if (temp == 1) {
//    			count++;
//    			result = i;
//    		}
//        }
//		return result;
//    }
//	private int getHelper(int i, int j) {
//		// TODO Auto-generated method stub
//		while (i%j == 0) {
//			 i /= j;
//		}
//		return i;
//	}
	/**
	 * @describe 运行时间：21ms 占用内存：8564k 采用动态规划；思想：Here is a time efficient solution with O(n) extra space.
	 *  The ugly-number sequence is 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
	 *  because every number can only be divided by 2, 3, 5, 
	 *  one way to look at the sequence is to split the sequence to three groups as below:
	 *  (1) 1×2, 2×2, 3×2, 4×2, 5×2, …
	 *  (2) 1×3, 2×3, 3×3, 4×3, 5×3, …
	 *  (3) 1×5, 2×5, 3×5, 4×5, 5×5, …
	 *  We can find that every subsequence is the ugly-sequence itself (1, 2, 3, 4, 5, …) multiply 2, 3, 5.
	 *  Then we use similar merge method as merge sort, 
	 *  to get every ugly number from the three subsequence. 
	 *  Every step we choose the smallest one, and move one step after.
	 * @param index
	 * @return
	 */
	public int getUglyNumberSolution(int index) {
		if (index < 1) {
			return 0;
		}
		int[] ugly = new int[index];
		ugly[0] = 1;
		int count2 = 0, count3 = 0, count5 = 0;
		int nextPossible2 = ugly[count2]*2;
		int nextPossible3 = ugly[count3]*3;
		int nextPossible5 = ugly[count5]*5;
		for (int i = 1; i < index; i++) {
			ugly[i] = Math.min(nextPossible2, Math.min(nextPossible3, nextPossible5));
			if (ugly[i] == nextPossible2) {
				count2++;
				nextPossible2 = ugly[count2] << 1;
			}
			if (ugly[i] == nextPossible3) {
				count3++;
				nextPossible3 = ugly[count3] * 3;
			}
			if (ugly[i] == nextPossible5) {
				count5++;
				nextPossible5 = ugly[count5] * 5;
			}
		}
		return ugly[index-1];
	}
	public static void main(String[] args) {
		GetUglyNumberSolution g = new GetUglyNumberSolution();
		System.out.println(g.getUglyNumberSolution(12));
	}
}
