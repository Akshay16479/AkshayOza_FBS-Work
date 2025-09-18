#include<stdio.h>
void evenOdd(int*,int);

void main() {
	int arr[5];
	printf("Enter Number :");
	for(int i=0; i<5; i++)
	{                                          //getting array
		scanf("%d",&arr[i]);
	}

	
	evenOdd(arr,5);
}

void evenOdd(int*arr,int num)
{
	

	printf("Even Numbers in Array are: ");
	for(int i=0; i<5; i++)
	{
		if(arr[i]%2==0)                         //check even
		printf("%d ",arr[i]);
		
	}
	
	printf("\nOdd Numbers in Array are: ");
	for(int i=0; i<5; i++) 
	{
		if(arr[i] % 2 != 0)                       //check odd
		printf("%d ", arr[i]);
		
	}

}