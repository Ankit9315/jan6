package dsa;
import java.util.Scanner;
import java.util.Stack;
public class reverseusingstack {
	static void reverse(String s)
	{
	  Stack<String> stc = new Stack<>();
	  String temp = "";
	  for(int i = 0; i < s.length(); i++)
	  {
	    if(s.charAt(i) == ' ')
	    {
	      stc.add(temp);
	      temp = "";         
	    }
	    else
	    {
	      temp = temp + s.charAt(i);
	    }
	 
	  }
	  stc.add(temp);
	 
	  while(!stc.isEmpty())
	  {
	    temp = stc.peek();
	    System.out.print(temp + " ");
	    stc.pop();
	  }
	   
	  System.out.println();
	}
	 
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  String s = sc.nextLine();
	  reverse(s);
	}
}
