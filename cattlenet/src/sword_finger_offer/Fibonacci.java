package sword_finger_offer;

/**
 * @time 18.3.29
 * @author 高位鹏
 * @describe 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39 斐波那契数列：
 *           F(0)=1，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 */
public class Fibonacci {
	/**
	 * @describe 直接递归求解
	 * @param n
	 * @return
	 */
//	public int fibonacci(int n) {
//		if (n > 2) {
//			return fibonacci(n - 1) + fibonacci(n - 2);
//		} else if (n == 0) {
//			return 0;
//		} else {
//			return 1;
//		}
//	}
	/**
	 * @describe 抛弃递归，循环求解，节省空间
	 * @param n
	 * @return
	 */
	public int fibonacci1(int n) {
		if(n == 0){
			return 0;
		}
		int differ = 0, result = 1;
		while (n-- > 1) {
			result += differ;
			differ = result - differ;
		}
		return result;

	}
}
