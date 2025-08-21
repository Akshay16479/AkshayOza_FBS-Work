#include <stdio.h>
void main()
{
	int a=525,p,q,r,temp,reverse;
	
	p=a%10;
	temp=a/10;
	q=temp%10;
	r=temp/10;
	
	reverse=(100*p+10*q+r);
	
	if(a==reverse)
	{
	printf("Number is Palindrome");
    }
     else
     {
     	printf("Number is not Palindrome");
	 }
	
	
		
	}
	
	
	
	

	

