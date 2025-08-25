#include<stdio.h>
void main ()
{
	int num=153,arm=0,p;
	int temp=num;
	
	for(num>0;num>0;)
	{
		p=num%10;
		arm=arm+(p*p*p);
		num=num/10;
		
	}
	if(temp==arm)
	printf("Number is Armstrong");
	else
	printf("Number is Not Armstrong");


	
}
