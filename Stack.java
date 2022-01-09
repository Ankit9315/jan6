package dsa;

import java.util.Scanner;

public class Stack {
	private int maxSize;
	   private long[] stackArray;
	   private int top;
	   
	   public Stack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   Stack  theStack = new Stack(n); 
		   for(int i=0;i<n;i++) {
			   int m=sc.nextInt();
	      theStack.push(m);
		   }
	      
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
}
