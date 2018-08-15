package sword_finger_offer;
/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
 *           他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,
 *           问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 *           例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)

 */
public class FindGreatestSumOfSubArray {
	/**
	 * @describe 运行时间：12ms 占用内存：9268k leetcode 原题应该;累加，结果小于0就归零，结果比预存最大值大就进行赋值；
	 * @param array
	 * @return
	 */
    public int findGreatestSumOfSubArray(int[] array) {
		int temp = 0;
		int result = array[0];
		for (int i = 0, length = array.length; i < length; i++) {
			temp += array[i];
			if (temp > result) {
				result = temp;
			}
			if (temp < 0) {
				temp = 0;
			}
		}
    	return result;
    }
    public static void main(String[] args) {
    	FindGreatestSumOfSubArray f = new FindGreatestSumOfSubArray();
    	int[] a = new int[]{1,2,-3,5,3,7,-10,6,5};
    	System.out.println(f.findGreatestSumOfSubArray(a));
	}
}
