package sword_finger_offer;
/**
 * @time 18.3.28
 * @author 高伟鹏
 * @describe 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *           运行时间：9ms
 *           占用内存：9140k
 * 
 */
import java.util.Stack;

public class TwoStacksImplementTheQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {//将元素全部压入栈1中
		stack1.add(node);
	}

	public int pop() {
		while(!stack1.isEmpty()){
			stack2.add(stack1.pop());//将栈1 的元素全部倒到栈2中，形成反序，确保栈顶元素是先放入的
		}
		int result = stack2.pop();//取出栈顶元素
		while(!stack2.isEmpty()){
			stack1.add(stack2.pop());//再将栈2元素全部倒到栈1，恢复顺序
		}
		return result;
	}
}
