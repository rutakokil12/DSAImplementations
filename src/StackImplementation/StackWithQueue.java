package StackImplementation;

import java.util.*;

public class StackWithQueue {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int top;

	// Push element x onto stack.
	public void push(int x) {	
	    q1.add(x);
	    top = x;
	}
	public void pop() {
		while (q1.size() > 1) {
	        top = q1.remove();
	        q2.add(top);
	    }
	    q1.remove();
	    Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;
	}
	public int getSize() {
		return q1.size();
	}
	
	public void display() {
		System.out.print("\nStack = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            Iterator it = q1.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
        }
	}
}
