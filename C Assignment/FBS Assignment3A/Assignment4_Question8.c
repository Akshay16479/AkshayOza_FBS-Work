#include <stdio.h>

void main()
{
	int num=121,p;
	int rev=0;
	int temp=num;
	
	for(num;num>0;)
	{
		p=num%10;
		rev=rev*10+p;
		num=num/10;
	}
	if(temp==rev)
	printf("No is Palindrome");
	else 
	printf("NO is Not Palindrome");
	
	
}
