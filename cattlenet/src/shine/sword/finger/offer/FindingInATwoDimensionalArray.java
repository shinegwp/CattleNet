package shine.sword.finger.offer;

/**
 * @time 18.3.25
 * @author 高位鹏
 * @describe 
 *           在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数
 *           ，判断数组中是否含有该整数。
 *           恭喜你通过本题 运行时间：145ms
 *           占用内存：18032k
 */
public class FindingInATwoDimensionalArray {
	public boolean Find(int target, int[][] array) {
		if (array != null) {
			int lengthRow = array.length;
			for (int i = 0; i < lengthRow; i++) {
				int lengthLine = array[i].length;
				for (int j = 0; j < lengthLine; j++) {
					if (target > array[i][j]) {
						continue;
					} else if (array[i][j] == target) {
						return true;
					} else {
						break;
					}
				}
			}
		}
		return false;
	}
	/*
	 * 大神解法：
	 * 链接：https://www.nowcoder.com/questionTerminal/abc3fe2ce8e146608e868a70efebf62e
                   来源：牛客网

                              利用二维数组由上到下，由左到右递增的规律，
                              那么选取右上角或者左下角的元素a[row][col]与target进行比较，
                              当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,
                              即col--；
                              当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
                              即row++；
	 */
//	public boolean Find(int target, int [][] array) {
//
//        int len = array.length-1;
//        int i = 0;
//        while((len >= 0)&& (i < array[0].length)){
//            if(array[len][i] > target){
//                len--;
//            }else if(array[len][i] < target){
//                i++;
//            }else{
//                return true;
//            }
//        }
//        return false;
//    }
}
