package QueueImplementation;

import java.util.Scanner;

public class QueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		QueueUsingStack qs = new QueueUsingStack();
		System.out.println("Enter integer element to enqueue");
        qs.enqueue( scan.nextInt() ); 
       
        System.out.println("Enter integer element to enqueue");
        qs.enqueue( scan.nextInt() );
       
        System.out.println("Enter integer element to enqueue");
        qs.enqueue( scan.nextInt() );
        qs.display();
        qs.dequeue();
        qs.display();
        qs.dequeue();
        qs.display();
        qs.dequeue();
	}

}
