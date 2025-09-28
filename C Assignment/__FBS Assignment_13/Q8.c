	#include<stdio.h>
	#include<stdlib.h>
    void storedisplay(int*,int);
	void main()
	{
		int n;
		printf("enter array size you want: ");
		scanf("%d",&n);
	    int*arr=(int*)malloc(n*sizeof(int));
		storedisplay(arr,n);
		
		free(arr);

	
	}
	
	void storedisplay(int*arr,int num)
	{
		printf("Enter Numbers :");
		for( int i=0;i<num;i++)
		{
			scanf("%d",&arr[i]);
		}
	
	   printf("Stored Numbers in Array are :");
	   for(int i=0;i<num;i++)
	   {
	   	printf("%d ",arr[i]);
	   }
		
	}