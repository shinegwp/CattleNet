package sword_finger_offer;

import java.util.Arrays;

/**
 * @time 18.3.29
 * @author 高伟鹏
 * @describe 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *           例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *           NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
	/**
	 * @describe 自己偷懒用到了排序
	 * @param array
	 * @return 该数组的最小元素
	 * @runtime  运行时间：422ms
	 *           占用内存：30252k
	 */
	// public int minNumberInRotateArray(int[] array) {
	// if (array != null && array.length > 0) {
	// Arrays.sort(array);
	// return array[0];
	// }
	// return 0;
	//
	// }
	/**
	 * @describe 在旋转处，元素是递减的，利用这一特点求解
	 * @param array
	 * @return
	 * @runtime 运行时间：327ms
	 *          占用内存：28704k
	 */
	public int minNumberInRotateArray(int[] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					return array[i + 1];
				}
			}
			return array[0];
		}
		return 0;

	}
}
