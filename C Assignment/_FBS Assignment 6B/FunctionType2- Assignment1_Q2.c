#include <stdio.h>
int a;
int REV();
void main()
{
	REV();
	
	if(a==REV())
	printf("Number is Palindrome");
    else
    printf("Number is not Palindrome");
	
}

int REV()
{
	int p,q,r,temp,reverse; a=525;
	p=a%10;
	temp=a/10;
	q=temp%10;
	r=temp/10;
	
	reverse=(100*p+10*q+r);
	
	return reverse;
	
}
	
	
	
	

	

