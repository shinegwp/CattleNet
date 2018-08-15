package sword_finger_offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *           例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNumSolution {
    /**
     * @describe 运行时间：32ms 占用内存：9288k 利用了之前常用的Map的键值对来记录每个元素出现的次数
     * @param array
     * @return
     */
//    public int MoreThanHalfNum_Solution(int [] array) {
//    	if (array == null || array.length == 0) {
//    		return 0;
//    	}
//		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
//		int result = 0;
//		for (int i = 0, length = array.length; i < length; i++) {
//			if (hashMap.containsKey(array[i])) {
//				int temp = hashMap.get(array[i]);
//				hashMap.replace(array[i], temp, ++temp);
//			} else {
//				hashMap.put(array[i], 1);
//			}
//		}
//		Iterator<Integer> it = hashMap.keySet().iterator();
//		int temp = 0;
//		while (it.hasNext()) {
//		    temp = it.next();
//			if (hashMap.get(temp) > array.length>>1) {
//				result = temp;
//				break;
//			}
//		}
//    	return result;
//    }
	/**
	 * @describe  利用排序巧解。若有个一个数超过数组长度的一半，则那个数经过排序后必然是中位数
	 * @param array
	 * @return
	 */
//	public int MoreThanHalfNum_Solution(int [] array){
//		if (array == null || array.length == 0) {
//			return 0;
//		}
//		Arrays.sort(array);
//		int target = array[array.length>>1];
//		int count = 0;
//		for (int i = 0, length = array.length; i < length; i++) {
//			if (target == array[i]) {
//				count++;
//			}
//		}
//		if (count > array.length >> 1) {
//			return target;
//		}
//		return 0;
//		
//	}
	
	/**
	 * @describe 利用数组的特性。若一个数在数组中数量超过一半，则最后的target一定是这个数
	 * @param array
	 * @return
	 */
	public int MoreThanHalfNum_Solution(int [] array){
		if (array == null || array.length == 0) {
			return 0;
		}
		int target = array[0];
		int time = 1;
		for (int i = 1, length = array.length; i < length; i++) {
			if (time == 0) {
				target = array[i];
				time = 1;
			} else {
				if (target == array[i]) {
					time++;
				} else {
					time--;
				}
			}
		}
		time = 0;
		for (int i = 0, length = array.length; i < length; i++) {
			if (target == array[i]) {
				time++;
			}
		}
		if (time > array.length>>1) {
			return target;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		MoreThanHalfNumSolution m = new MoreThanHalfNumSolution();
		int[] x = {1,2,3,4,2};
		System.out.println(m.MoreThanHalfNum_Solution(x));
	}
}
