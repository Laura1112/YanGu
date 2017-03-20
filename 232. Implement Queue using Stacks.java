import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * @author Laura
 *
 */
//���⣺��ջʵ�ֶ��еĲ���
//��̬/�ࣨstatic����ʵ�����ޣ�ʵ���������Ե���ʵ������������������෽��ֻ�ܵ����������
//�෽����������������Ҳ�����ɶ�����ã���ʵ������ֻ���ɶ������
//��̬/�෽��ֻ�ܵ��þ�̬/�෽�������ܵ���ʵ������
class MyQueue {
    // Push element x to the back of queue.
	private int front;
	private static Stack<Integer> s1 = new Stack<>();
	private static Stack<Integer> s2 = new Stack<>();

	public void push(int x) {
	    if (s1.empty())
	        s1.add(x);
	    else{
		    while (!s1.isEmpty())
		        s2.push(s1.pop());
		    s2.push(x);
		    while (!s2.isEmpty())
		        s1.push(s2.pop());
	    }		
	}

    // Removes the element from in front of queue.
    public void pop() {
        s1.pop();
    }

    // Get the front element.
    public int peek() {
        return s1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return s1.isEmpty();
    }
	   
    public static void main(String[] arg){   	
    	MyQueue t = new MyQueue();
    	t.push(1);
    	t.pop();   	
    	System.out.println(t.empty());
    }
}