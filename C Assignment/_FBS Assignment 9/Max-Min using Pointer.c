#include<stdio.h>
void maxValue(int*,int),minValue(int*,int);
void main() {
	int arr[5];

	printf("Enter Numbers: ");
	for(int i=0; i<5; i++) 
	{
		scanf("%d",&arr[i]);
	}
	
	maxValue(arr,5);
	minValue(arr,5);
}

void maxValue(int arr[],int num)
{
	int max = arr[0];
	for(int i = 1; i < num; i++) 
	{
		if(arr[i] > max)
		max = arr[i];		
	}
	printf("maximum number is %d\n",max);
}

void minValue(int*arr,int num)
{
	int min = arr[0];
    for(int i = 1; i < num; i++) 
	{
		 if(arr[i] < min)
		min = arr[i];
	}
	printf("minimum number is %d\n",	min);
}