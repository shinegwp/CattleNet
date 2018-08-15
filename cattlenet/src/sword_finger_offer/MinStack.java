package sword_finger_offer;
/**
 * @time 18.4.11
 * @author 高位鹏
 * @describe 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
import java.util.Stack;
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        stack.add(node);
    }
    
    public void pop() {
        
    }
    
    public int top() {
		return 0;
        
    }
    
    public int min() {
		return 0;
        
    }
}
