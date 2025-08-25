#include<stdio.h>
void main ()
{
	int num=7; 
	int i=2;
	
	for(i;i<num;i++)
	{
		if(num%i==0)
		printf("Number is Not Prime");  //without taking flag=0
		
	    else if(num%i!=0)
		printf("Number is Prime ");
		break;
		
	}
	
}
