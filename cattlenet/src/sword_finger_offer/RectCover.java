package sword_finger_offer;

/**
 * @time 18.3.30
 * @author 高位鹏
 * @descrinbe 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *            运行时间：15ms
 *            占用内存：8460k
 */
public class RectCover {
    /**
     * @describe  简单的进行分析可以看出是符合Fibonacci数列规则的
     * @param target
     * @return
     */
	public int rectCover(int target) {
		int sum = 0, preNumber = 1, prePreNumber = 1;
		if (target < 2) {
			return target;
		} else {
			while (target-- >= 2) {
				sum = preNumber + prePreNumber;
				prePreNumber = preNumber;
				preNumber = sum;
			}
			return sum;
		}
	}
}
