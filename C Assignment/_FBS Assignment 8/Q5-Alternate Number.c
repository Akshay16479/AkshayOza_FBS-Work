	#include<stdio.h>
	void main()
	{
		int n;
		printf("enter array size you want: ");
		scanf("%d",&n);
		int arr[n];
	  
		printf("Enter Numbers :");
		for( int i=0;i<n;i++)
		{
			scanf("%d",&arr[i]);
		}
	
	    printf("Array Values in Alternate Index are :");
	    for(int i=0;i<n;i=i+2)
	    {
	    	printf("%d\n",arr[i]);	
		}
	
	}