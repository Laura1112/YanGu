import java.util.LinkedList;

/**
 * Implement the following operations of a stack using queues.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
 * @author Laura
 *
 */

class MyStack {
    // Push element x onto stack.
	private static LinkedList<Integer> list = new LinkedList<>();
	
    public void push(int x) {
        list.add(0, x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        list.remove(0);
    }

    // Get the top element.
    public int top() {
        return list.get(0);
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return list.isEmpty();
    }
    
    public static void main(String[] aeg){
    	MyStack t = new MyStack();
    	t.push(3);
    	//t.pop();
    	System.out.println(t.top());
    }
}