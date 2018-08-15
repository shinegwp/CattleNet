package sword_finger_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @time 18.4.12
 * @author 高位鹏
 * @describe 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class GetLeastNumbersSolution {
    private GetLeastNumbersSolution(){}
    
    /**
     * @describe 运行时间：26ms 占用内存：9036k 先排序，后遍历输出;因为用了快排，时间复杂度为nlog(n);
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> getLeastNumbersSolution(int [] input, int k) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	if (input == null || input.length < k) {
    		return array;
    	}
    	Arrays.sort(input);
    	for (int i = 0; i < k; i++) {
    		array.add(input[i]);
    	}
    	return array;
    }
    public static void main(String[] args) {
    	GetLeastNumbersSolution g = new GetLeastNumbersSolution();
    	int[] a = {1,2,3,4,0,6,5};
    	for (int i : g.getLeastNumbersSolution(a, 2)) {
    		System.out.println(i);
    	}
	}
}
