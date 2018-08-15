package sword_finger_offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *           例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *           输入描述：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Permutation {
    /**
     * @describe  惨败告终
     * @param str
     * @return
     */
//	public ArrayList<String> Permutation(String str) {
//		char[] arr = str.toCharArray();
//		Arrays.sort(arr);
//		ArrayList<String> array = new ArrayList<String>();
//		array.add(arr.toString());
//		for (int i = arr.length-2,temp = 0; i > 0; i--) {
//			temp = i;
//			while (i < arr.length-1) {
//				swap(arr, i);
//				array.add(arr.toString());
//				i++;
//			}
//			while (i - temp > 1) {
//				i = temp;
//				char c = arr[i];
//				while (i < arr.length-1) {
//					swap(arr, i);
//					i++;
//				}
//				arr[i] = c;
//				i++;
//				array.add(arr.toString());
//				
//			}
//			
//		}
//		return null;
//	       
//    }
//
//	private void swap(char[] arr, int i) {
//		// TODO Auto-generated method stub
//		char temp = ' ';
//		temp = arr[i];
//		arr[i] = arr[i+1];
//		arr[i+1] = temp;
//	}
	/**
	 * @describe 运行时间：112ms 占用内存：12372k  采用回溯法
	 * @param str
	 * @return
	 */
	public ArrayList<String> permutation(String str) {
		ArrayList<String> array = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return array;
		}
		char[] arr = str.toCharArray();
		permutationHelper(arr, 0, array); 
		Collections.sort(array);
		return array;
	       
    }

	private void permutationHelper(char[] arr, int start, ArrayList<String> array) {
		if (start == arr.length) {
			if (!array.contains(String.valueOf(arr))) {
				array.add(String.valueOf(arr));
			}
		}
		for (int i = start, length = arr.length; i < length; i++) {
			swap(arr, start, i);
			permutationHelper(arr, start+1, array);
			swap(arr, start, i);
		}
	}

	private void swap(char[] arr, int start, int i) {
		// TODO Auto-generated method stub
		char temp = arr[start];
		arr[start] = arr[i];
		arr[i] = temp;
	}
	public static void main(String[] args) {
		Permutation p = new Permutation();
		for (String s : p.permutation("abc")) {
			System.out.println(s);
		}
	}
}
