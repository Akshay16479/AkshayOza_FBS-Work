#include<stdio.h>

void main() {

	int arr[5], brr[5] ;


	printf("enter array1 elements :");
	for(int i=0; i<5; i++) {
		scanf("%d",&arr[i]);
	}

	printf("enter array2 elements :");
	for(int i=0; i<5; i++) {
		scanf("%d",&brr[i]);
	}


	printf("Elements in array 2 that are not  in array1 :");
    for(int i = 0; i < 5; i++) 
	{
		if(brr[i]!=arr[i])
		printf("%d\n",brr[i]);
	}
}