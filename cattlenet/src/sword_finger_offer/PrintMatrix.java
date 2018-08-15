package sword_finger_offer;

import java.util.ArrayList;

/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 
 */
public class PrintMatrix {
    /**
     * @describe 经过无数次调试终于成功了，还是没有考虑全面 运行时间：34ms 占用内存：8848k
     * @param matrix
     * @return
     */
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rowStart = 0, rowEnd = matrix.length-1, rankStart = 0, rankEnd = matrix[0].length-1;//记录矩形的四个顶点位置
		while (rowStart <= rowEnd && rankStart <= rankEnd) {
			
			for (int i = rankStart; i <= rankEnd; i++) {//从左到右
				list.add(matrix[rowStart][i]);
			}
			
			
			for (int i = rowStart+1; i <= rowEnd; i++) {//从上到下
				list.add(matrix[i][rankEnd]);
			}
			if (rowEnd != rowStart) { //判断是否只有一行，若只有一行则没必要进行从右到左打印
				for (int i = rankEnd-1; i >= rankStart; i--) {//从右到左打印
					list.add(matrix[rowEnd][i]);
				}
			}
			if (rankStart != rankEnd) {//判断是否只有一列，若只有一列，则没有必要进行从下到上打印
				for (int i = rowEnd-1; i >= rowStart+1; i--) {//从上到下打印
					list.add(matrix[i][rankStart]);
				}
			}
			rowStart++;
			rowEnd--;
			rankStart++;
			rankEnd--;
		}
		return list;
	       
    }
}
