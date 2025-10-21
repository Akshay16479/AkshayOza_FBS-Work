package assignment1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=525,p,q,r,temp,reverse;
		
		p=a%10;
		temp=a/10;
		q=temp%10;
		r=temp/10;
		
		reverse=(100*p+10*q+r);
		
		if(a==reverse)
		{
		System.out.printf("Number is Palindrome");
	    }
	     else
	     {
	     	System.out.printf("Number is not Palindrome");
		 }
		
	}

}
