package sword_finger_offer;

/**
 * @time 18.3.27
 * @author 高伟鹏
 * @describe 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are
 *           Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class RepalceSpaces {
	/*
	 * 自己不完善的答案
	 */
	// public String replaceSpace(StringBuffer str) {
	// String answer = "";
	// for(int i = 0; i < str.length(); i++){
	// if(str.charAt(i) == ' '){
	// answer += "%20";
	// }else{
	// answer += str.charAt(i);
	// }
	// }
	// return answer;
	//
	// }
	/*
	 * 巧妙解法，采用正则表达式
	 */
//	public String replaceSpace(StringBuffer str) {
//		return str.toString().replaceAll(" " , "%20");
//	}
	 

	/*
	 * 
	 * 改良后的答案
	 */

	public String replaceSpace(StringBuffer str) {
		int spaceNum = 0;// spacenum为计算空格数
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexOld = str.length() - 1;// indexold为为替换前的str下标
		int newLength = str.length() + spaceNum * 2;// 计算空格转换成%20之后的str长度
		int indexNew = newLength - 1;// indexold为为把空格替换为%20后的str下标
		str.setLength(newLength);// 使str的长度扩大到转换成%20之后的长度,防止下标越界
		for (; indexOld >= 0; --indexOld) {
			if (spaceNum == 0) {
				break;
			}
			if (str.charAt(indexOld) == ' ') {
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');
			} else {
				str.setCharAt(indexNew--, str.charAt(indexOld));
			}
		}
		return str.toString();
	}
}
