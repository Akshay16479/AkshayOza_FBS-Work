#include <stdio.h>

void main() {
    int arr[10];
    store(arr, 10);
    display(arr, 10);
    replace(arr, 10, 5, 7);
    display(arr, 10);
}

void store(int* a, int n) {
    printf("Enter %d elements:\n", n);
    for(int i = 0; i < n; i++)
        scanf("%d", &a[i]);
}

void display(int* a, int n) {
    printf("Array elements are:\n");
    for(int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");
}

void replace(int* a, int n, int old, int no) {
    for(int i = 0; i < n; i++)
        if(a[i] == old)
            a[i] = no;
}
