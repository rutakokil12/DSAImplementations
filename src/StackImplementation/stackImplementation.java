package StackImplementation;

import java.util.Scanner;

public class stackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StackWithQueue sq = new StackWithQueue();
		System.out.println("Enter integer element to push");
        sq.push( scan.nextInt() ); 
        sq.display(); 
        System.out.println("Enter integer element to push");
        sq.push( scan.nextInt() );
        System.out.println("Enter integer element to push");
        sq.push( scan.nextInt() );
        sq.display(); 
        sq.pop();
        sq.display();
        sq.pop();
        sq.display();
	}

}
