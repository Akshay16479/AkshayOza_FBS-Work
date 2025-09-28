#include<stdio.h>
#include<stdlib.h>
void main() {
	int i;
    int*arr=(int*)malloc(5*sizeof(int));
	printf("Enter Numbers: ");

	for(i=0; i<5; i++) {
		scanf("%d",&arr[i]);
	}

	int max = arr[0];
	int min = arr[0];

	for(i = 1; i < 5; i++) 
	{
		if(arr[i] > max)
			max = arr[i];
			
		else if(arr[i] < min)
			min = arr[i];
	}
	
	printf("maximum number is %d\n",	max);
	printf("minimum number is %d\n",	min);

free(arr);
}