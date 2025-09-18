#include<stdio.h>
int sum(int*,int);
void main()
{
	int arr[5];
	int res=sum(arr,5);
		printf("Sum of digits in Array is %d",res);
}

int sum(int *arr,int num)
{
	int sum=0;
	printf("Enter Number: ");
	for(int i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<num;i++)
	{
		sum=sum+arr[i];
	}
	
return sum;
	
}