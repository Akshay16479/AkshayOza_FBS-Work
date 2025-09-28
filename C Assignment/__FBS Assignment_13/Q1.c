#include <stdio.h>
#include <stdlib.h>   // for malloc, free

int main() {
    int *arr, *brr;
    int n = 5;

    // allocate memory for both arrays
    arr = (int *)malloc(n * sizeof(int));
    brr = (int *)malloc(n * sizeof(int));


    printf("Enter array1 elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter array2 elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &brr[i]);
    }

    printf("Elements in array2 that are not in array1 :\n");
    for (int i = 0; i < n; i++) {
        if (brr[i] != arr[i]) {   // ?? same condition as your code
            printf("%d\n", brr[i]);
        }
    }

    // free memory
    free(arr);
    free(brr);

}
