package QueueImplementation;
import java.util.*;
public class QueueUsingStack {
	Stack <Integer> s;
	Stack <Integer> temp;
	public QueueUsingStack() {
		s = new Stack<Integer>();
		temp = new Stack<Integer>();
		
	}
	
	public void enqueue(int data) {
		if(s.size() == 0) {
			s.push(data);
		}
		else
		{
			int l = s.size();
		for(int i=0;i<l; i++) {
			temp.push(s.pop());
		}
		s.push(data);
		for(int i =0; i<l; i++) {
			s.push(temp.pop());
		}
	}
}
	public int dequeue() {
		if(s.size() == 0) 
			System.out.println("queue is empty");
		return s.pop();
		
	}
	public int getSize() {
		return s.size();
	}
	
	public void display() {
		System.out.print("\nQueue = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
           for(int i = l-1; i>=0; i--)
                System.out.print(s.get(i)+" ");
            System.out.println();
        }
	}
}
