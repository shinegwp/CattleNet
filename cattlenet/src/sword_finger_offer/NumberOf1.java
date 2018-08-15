package sword_finger_offer;

/**
 * @time 18.3.30
 * @author 高位鹏
 * @describe 习题二进制中1的个数
 */
public class NumberOf1 {
    /**
     * @runtime 运行时间：28ms 占用内存：8780k
     * @param 输入一个整数
     * @return 输出该数二进制表示中1的个数。其中负数用补码表示。
     * @descrinbe 渣渣思想：分为整数与负数。整数略，负数先取绝对值，对二取余法，记录相反数据，不足32位时，其他位补1，（因为记录的是反码）；最后+1获取补码
     */
//	public int numberOf1(int n) {
//		StringBuffer sb = new StringBuffer();
//		int temp = 0;
//		if (n >= 0) {
//			while (n != 0) {
//				sb.append(n % 2);
//				n /= 2;
//			}
//			for (int i = 0; i < sb.length(); i++) {
//				if (sb.charAt(i) == '1') {
//					temp++;
//					System.out.println(temp);
//				}
//			}
//		} else {
//			int nn = Math.abs(n);//取绝对值
//			while (nn != 0) {
//				if (nn % 2 == 1) {//记录相反数据
//					sb.insert(0, '0');
//				} else {
//					sb.insert(0, '1');
//				}
//				nn /= 2;
//			}
//			while (sb.length() != 32) {//若不足32位，其他位补1
//				sb.insert(0, '1');
//			}
//			int i = sb.length() - 1;//进行加1操作
//			if (sb.charAt(i) == '1') {//若末尾是1
//				while (i > 0 && sb.charAt(i) == '1') {
//					sb.setCharAt(i, '0');
//					i--;
//				}
//				sb.setCharAt(i, '1');
//			} else {//若末尾是0
//				sb.setCharAt(i, '1');
//			}
//			for (int j = 0; j < sb.length(); j++) {
//				if (sb.charAt(j) == '1') {
//					temp++;
//				}
//			}
//
//		}
//		return temp;
//	}
	/**
	 * @大神解法1，思想：采用按位于思想
	 *              1的二进制是 前面都是0，最后一位为1，也就是只有一个1，每次向左移位一下，
	 *              使得flag的二进制表示中始终只有一个位为1，每次与n做位与操作，这样就相当于逐个检测n的每一位是否是1了。
	 * @param n
	 * @return
	 */
//	public int numberOf1(int n) {
//		int flag = 1;
//		int count = 0;
//		while(flag != 0){
//			if((n & flag) == 1){
//				count++;
//			}
//			flag = flag << 1;
//		}
//		return count;
//	}
	/**
	 * @describe 极致最优解：将最右边的1变为0，有几个1就循环几次
	 * @param n
	 * @return
	 */
	public int numberOf1(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = (n-1) & n;//去除最右边的1
		}
		return count;
		
	}
	
	
}
