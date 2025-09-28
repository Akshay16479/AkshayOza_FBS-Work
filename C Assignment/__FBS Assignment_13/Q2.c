#include<stdio.h>
#include<stdlib.h>
void main() {
    int  i, j, duplicate;
    
    int*arr=(int*)malloc(5*sizeof(int));
    

    printf("Enter array elements: ");
    for (i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Array without duplicate values: ");
    for (i = 0; i < 5; i++) {
        duplicate = 0;
        for (j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                duplicate = 1;
                break;
            }
        }
        if (duplicate==0) {
            printf("%d\n", arr[i]);
        }
    }
    
    free(arr);
   
}
