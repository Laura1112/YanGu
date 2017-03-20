import java.util.List;
import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 * @author Laura
 *
 */

//���⣺����ջ��ȡ����ȡ��С
//������ջ�洢������һ��ջ�洢����push�����ݣ�һ��ջֻ���С��
public class MinStack {
	private Stack<Integer> s;
	private Stack<Integer> min;
    /** initialize your data structure here. */
	//���췽��
    public MinStack() {   	
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int x) {
    	if(min.isEmpty()||x<=min.peek())
    		min.push(x);
        s.push(x);
    }
    
    public void pop() {
    	if((s.peek()).equals(min.peek()))
    		min.pop();
        s.pop();
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
    
    public static void main(String[] arg){
    	MinStack m = new MinStack();
    	m.push(512);
    	m.push(-1024);
    	m.push(-1024);
    	m.push(512);
    	m.pop();    
    	System.out.println(m.getMin());
    	m.pop();    	
    	System.out.println(m.getMin());
    	m.pop();    	
    	System.out.println(m.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */