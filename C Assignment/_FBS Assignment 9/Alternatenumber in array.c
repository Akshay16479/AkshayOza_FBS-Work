	#include<stdio.h>
	 void store(int*,int),alternate(int*,int);
	void main()
	{
		int n;
		printf("enter array size you want: ");
		scanf("%d",&n);	
		int arr[n];
	
		store(arr,n);
		alternate(arr,n);
}

void store(int*arr,int n)
{
	printf("Enter Numbers :");
		for( int i=0;i<n;i++)
		{
			scanf("%d",&arr[i]);
		}
}

void alternate(int *arr,int n)
{
	printf("Array Values in Alternate Index are :");
	    for(int i=0;i<n;i=i+2)
	    {
	    	printf("%d\n",arr[i]);	
		}
}