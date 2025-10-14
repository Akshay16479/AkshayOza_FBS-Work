#include<stdio.h>
int facto(int);
void main()
{
	int n;
	printf("enter n: ");
	scanf("%d",&n);
	int res=facto(n);
	printf("sum is %d",res);
}

int facto(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
			
		}
		sum=sum+fact;
		
	}
	return sum;
}