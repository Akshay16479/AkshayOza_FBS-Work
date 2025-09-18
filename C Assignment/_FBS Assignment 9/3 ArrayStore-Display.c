	#include<stdio.h>
	
	void store(int*,int),display(int*,int);
	void main()
	{
		int arr[5],brr[7],crr[10];
		printf("Enter elements of array 1 : ");
		store(arr,5);
		printf("Enter elements of array 2 : ");
		store(brr,7);
		printf("Enter elements of array 3 : ");
		store(crr,10);
	display(arr,5);
	display(brr,5);
		display(crr,10);
	
	}
	
	void store(int*kuchbhi,int num)
	{
		for (int i=0;i<num;i++)
		scanf("%d",&kuchbhi[i]);
	}
	void display(int*kuchbhi,int num)
	{
		printf("[ ");
		for (int i=0;i<num;i++)
		printf("%d",kuchbhi[i]);
		printf(" ]");
	}
	
	