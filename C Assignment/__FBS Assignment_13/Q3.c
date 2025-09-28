#include <stdio.h>
#include<stdlib.h>
void main() {
    int i, j, temp;
    int*arr=(int*)malloc(sizeof(40));

    printf("Enter 10 elements: ");
    for (i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);
    }

    // Bubble sort 
    for (i = 0; i < 10; i++) {
        for (j = 0; j < 10; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    printf("Largest three numbers are: %d %d %d\n", arr[0], arr[1], arr[2]);
    
    free(arr);
    
}
