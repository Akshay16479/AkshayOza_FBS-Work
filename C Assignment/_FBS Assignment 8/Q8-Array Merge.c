#include<stdio.h>

void main() {

	int arr[5], brr[5], crr[10];


	printf("enter array1 elements :");
	for(int i=0; i<5; i++) {
		scanf("%d",&arr[i]);
	}

	printf("enter array2 elements :");
	for(int i=0; i<5; i++) {
		scanf("%d",&brr[i]);
	}


	printf("Merging of array1 and array2 elements are :");
	
    for(int i = 0; i < 5; i++) 
	{
        crr[i] = arr[i];      
		 printf("%d\n", crr[i]); 
    }
    
    for(int i = 0; i < 5; i++)
	{
        crr[i+5] = brr[i];
		 printf("%d\n", crr[i + 5]);  
    }
    

}

