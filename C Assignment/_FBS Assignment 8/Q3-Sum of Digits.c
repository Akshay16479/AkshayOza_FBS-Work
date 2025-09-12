#include<stdio.h>
void main()
{
	int arr[5];
	int sum=0;
	printf("Enter Number: ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
	{
		sum=sum+arr[i];
	}
	
	printf("Sum of digits in Array is %d",sum);
	
}