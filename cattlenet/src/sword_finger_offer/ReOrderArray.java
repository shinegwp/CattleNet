package sword_finger_offer;
/**
 * @time 18.4.2
 * @author 高位鹏
 * @describe 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *           所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
	/**
	 * @describe 创建两个数组，一个用来放偶数，一个放奇数，最后将数据进行整合
	 * @param array
	 * @runtime 运行时间：13ms
	 *          占用内存：9540k
	 */
	public void reOrderArray(int[] array) {
		if (array.length > 0) {
			int[] evenNumber = new int[array.length];
			int[] oddNumber = new int[array.length];
			int evenCount = 0, oddCount = 0;
			for (int i = 0, length = array.length; i < length; i++) {
				if ((array[i] & 1) == 0) {
					evenNumber[evenCount] = array[i];
					evenCount++;
				} else {
					oddNumber[oddCount] = array[i];
					oddCount++;
				}
			}
			for (int i = 0, length = array.length - 1; i < evenCount; i++) {
				array[length - i] = evenNumber[evenCount-i-1];
			}
			for (int i = 0; i < oddCount; i++) {
				array[i] = oddNumber[i];
			}
		}
	}
}
