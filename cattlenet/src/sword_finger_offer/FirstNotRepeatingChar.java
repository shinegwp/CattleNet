package sword_finger_offer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class FirstNotRepeatingChar {
    /**
     * @describe 运行时间：71ms  占用内存：10012k 
     *           思路： 运用一个hashmap来判断元素是否重复，用一个list来存储不重复元素的下标
     * @param str
     * @return
     */
//	public int firstNotRepeatingChar(String str) {
//		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
//		ArrayList<Integer> array = new ArrayList<Integer>();
//		for (int i = 0, length = str.length(); i < length; i++) {
//			if (!hash.containsKey(str.charAt(i))) {//如果不重复
//				array.add(i);
//				hash.put(str.charAt(i), i);//将字符为键，下标为值，放入map中
//			} else {
//				array.remove(hash.get(str.charAt(i)));//如果重复，则移除list中对应的下标
//			}
//		}
//        return array.get(0);
//    }
	/**
	 * @describe 大神极简思路：首先创建一个足够长度的数组，‘z’在ASCII中是最大的。第一次遍历，若出现则加1；第二次遍历找到为1的值，返回原数组下标
	 * @param str
	 * @return
	 */
	public int firstNotRepeatingChar(String str) {
		char[] arr = str.toCharArray();
		int[] temp = new int['z'+1];
		for (char c : arr) {
			temp[c]++;
		}
		for (int i = 0, length = arr.length; i < length; i++) {
			if (temp[arr[i]] == 1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		FirstNotRepeatingChar f = new FirstNotRepeatingChar();
		System.out.println(f.firstNotRepeatingChar("ahjkladsflufhakebj"));
	}
}
