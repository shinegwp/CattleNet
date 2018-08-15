package sword_finger_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 *           打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 *           则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumber {
	/**
	 * @describe  运行时间：32ms 占用内存：9436k  与之前做的字符串的排列一个思路，采用回溯法
	 * @param numbers
	 * @return
	 */
//	public String printMinNumber(int [] numbers) {
//		ArrayList<String> array = new ArrayList<String>();
//		printMinNumberHelper(numbers, 0, array);
//		Collections.sort(array);//对所的列表按照自然顺序排序即可得最小的
//		if (array == null || numbers.length == 0) {
//			return "";
//		}
//		return array.get(0);
//
//    }
//
//	private void printMinNumberHelper(int[] numbers, int start,
//			ArrayList<String> array) {
//		// TODO Auto-generated method stub
//		if (start == numbers.length-1) {
//			StringBuilder sb = new StringBuilder();
//			for (int i = 0, length = numbers.length; i < length; i++) {//将数组转化成字符串
//				sb.append(numbers[i]);
//			}
//			array.add(String.valueOf(sb));
//			return;
//		}
//		for (int i = start, length = numbers.length; i < length; i++) {
//			swap(numbers, start, i);
//			printMinNumberHelper(numbers, start+1, array);
//			swap(numbers, start, i);//此处做返回处理，保证下一次进行交换时，还是原数组
//		}
//		
//	}
//
//	private void swap(int[] numbers, int start, int i) {
//		// TODO Auto-generated method stub
//		int temp = numbers[start];
//		numbers[start] = numbers[i];
//		numbers[i] = temp;
//	}
	/**
	 * @describe  大神思想：重写比较器，进行特殊排序。
	 *            为什么不用回溯法，因为回溯法写出了所有的组合情况，而本题只需要字典排序最前的情况。
	 * @param numbers
	 * @return
	 */
	public String printMinNumber(int [] numbers){
		if (numbers.length == 0) {
			return "";
		}
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0, length = numbers.length; i < length; i++) {
			array.add(String.valueOf(numbers[i]));
		}
		Collections.sort(array, new Comparator<String>(){
			public int compare(String o1, String o2) {
				String str1 = o1+o2;
				String str2 = o2+o1;
				return str1.compareTo(str2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (String s : array) {
			sb.append(s);
		}
		return String.valueOf(sb);
		
	}
	public static void main(String[] args) {
		PrintMinNumber p = new PrintMinNumber();
		int []a = {3,32,321};
		System.out.println(p.printMinNumber(a));
	}
}
