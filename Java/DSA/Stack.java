package ADT;

public class stack {

	int []arr;
	int top;
	
	stack(int size)
	{
		arr=new int[size];
		top=-1;
	}
	
	boolean isFull()
	{
		if(top==arr.length-1)
			return true;
		else
			return false;
	}
	
	 boolean isEmpty()
	{
		if(top==-1)
			return true;
		else return false;
	}
	
	
	 void push(int element)
	 {
		 if(isFull()==false) 
		 {
			 top++;
			 arr[top]=element; 
		 }
		 else
			 System.out.println("Stack Overflow");
	 }
	 
	 
	 int pop()
	 {
		 if(isEmpty()==false)
		 {
			 int store=arr[top];
			 top--;
			 return store;
		 }
		 else
			 System.out.println("Stack Underflow");
		     return -1;		 
	 }
	 
	 
	int peek()
	 {
		 if(isEmpty()==false)
		 {
			 return arr[top];
		 }
		 else
			 System.out.println("Stack Underflow");
	         return -1;
	 }
	 
	
	
	public static void main(String[] args) {
		
		stack s=new stack(5);
		s.push(20);
		s.push(80);
		s.push(40);
		s.push(65);
		s.push(30);
		s.push(100);
		System.out.println("Top element is: " + s.peek());
	    System.out.println("Popped element is: " + s.pop());
	    System.out.println("New top element is: " + s.peek());
	    
	    System.out.println("New push element is: " + s.peek());		

	}
	 
	 
	
}
