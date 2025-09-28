#include<stdio.h>
#include<stdlib.h>
void main() {

	int n;
	printf("Enter the size of the arrays: ");
	scanf("%d", &n);

     int*arr=(int*)malloc(n*sizeof(int));
      int*brr=(int*)malloc(n*sizeof(int));
       int*crr=(int*)malloc(n*sizeof(int));


	printf("enter array1 elements :");
	for(int i=0; i<n; i++) {
		scanf("%d",&arr[i]);
	}

	printf("enter array2 elements :");
	for(int i=0; i<n; i++) {
		scanf("%d",&brr[i]);
	}


	printf("Addition of array1 and array2 elements are :");
	for(int i=0; i<n; i++) {
		crr[i]=arr[i]+brr[i];

		printf("%d\n",crr[i])	;
	}

free(arr);
free(brr);
free(crr);

}
