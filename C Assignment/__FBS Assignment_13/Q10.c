#include<stdio.h>
#include<stdlib.h>
void main() {

	int*arr=(int*)malloc(5*sizeof(int));
      int*brr=(int*)malloc(5*sizeof(int));
       int*crr=(int*)malloc(10*sizeof(int));



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
    
    free(arr);
    free(brr);
    free(crr);
    

}

