#include<stdio.h>
void main()
{
	int num=145;
	int p,fact=1,sum=0;
	int i=1;
	int temp=num;
	
	for(num;num>0;)
	{
		p=num%10;
		fact=1;
		
		for(i=1;i<=p;i++)
		{
		fact=fact*i;	
		}
		
		sum=sum+fact;
		num=num/10;
   }
        if(sum==temp)
        printf("strong Number ");
        else
        printf("Not Strong Number");
}


