package dsa;

import java.util.Scanner;

public class parenthesis {
	public static boolean isValid(String s) {
        int length = s.length();
        if (length == 1) return false;
        int j = 0;
        char[] c = new char[length];
        for (int i = 0; i < length; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parenthesis.push(c[i]);
            } else if (j > 0 && ((s.charAt(i) == ')' && c[j-1] == '(') || 
                       (s.charAt(i) == ']' && c[j-1] == '[') || (s.charAt(i) == '}' && c[j-1] == '{')))
            	j--;
            else return false;
        }
        return j == 0;
    }
	private int maxSize;
	   private static char[] stackArray;
	   private static int top;
	   
	   public parenthesis(int s) {
	      maxSize = s;
	      stackArray = new char[maxSize];
	      top = -1;
	   }
	   public static void push(char j) {
	      stackArray[++top] =j ;
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
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		parenthesis s=new parenthesis(n);
		s.isValid(a);
		
	}
}
