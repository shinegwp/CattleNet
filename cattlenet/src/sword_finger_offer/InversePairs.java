package sword_finger_offer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 *           输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 输入描述:
 * 题目保证输入的数组中没有的相同的数字
 * 数据范围：
 *       对于%50的数据,size<=10^4
 *       对于%75的数据,size<=10^5
 *       对于%100的数据,size<=2*10^5
 *       示例1
 *       输入
 *       1,2,3,4,5,6,7,0
 *       输出
 *       7
 */
public class InversePairs {
    /**
     * @describe  超时……
     * @param array
     * @return
     */
    public int inversePairs(int [] array) {
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0, length = array.length; i < length; i++) {
			arr.add(array[i]);
		}
		Arrays.sort(array);
		for (int i = array.length-1; i > 0; i--) {
			for (int j = arr.size()-1; j >= 0; j--) {
				if (arr.get(j) == array[i]) {
					count += arr.size() - j - 1;
					arr.remove(j);
					break;
				}
			}
		}
    	return count%1000000007;
    }
    public static void main(String[] args) {
    	InversePairs i = new InversePairs();
    	int[] ii = new int[]{7,6,5,4,4,3,2,1};
    	System.out.println(i.inversePairs(ii));
	}
}
