package assignment3;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,rev=0,p;
		  int temp=num;
		    
		  while(num>0)
		  {
		  
		   	p=num%10;
		    rev=rev*10+p;
			num=num/10;
		  }
		  
		 if(temp==rev)
		System.out.printf("No is Palindrome");
		else
		System.out.printf("Not Palindrome");
		   
	}

}
