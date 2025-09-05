#include <stdio.h>
void checkPalin();
void main()
{
	checkPalin();
}
 
  void checkPalin()
 {
	
int a=525;
int p=a%10;
int	temp=a/10;
int	q=temp%10;
int r=temp/10;

int reverse=(100*p+10*q+r);
	
	a==reverse?printf("Number is Palindrome"): printf("Number is not Palindrome");
}
		
	
	

	

