package sword_finger_offer;
/**
 * @time 18.4.13
 * @author 高位鹏
 * @describe 统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {
    /**
     * @describe  运行时间：19ms 占用内存：9376k 排序数组的特点就是连续，相同数字在聚在一起
     * @param array
     * @param k
     * @return
     */
	public int getNumberOfK(int [] array , int k) {
		int count = 0;
		for (int i = 0, length = array.length; i < length; i++) {
			if (array[i] == k) {
				while (i < length && array[i] == k) {
					count++;
					i++;
				}
				break;
			}
		}
		return count;
	       
    }
}
