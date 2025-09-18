#include <stdio.h>

// Function prototypes
void store(int* , int );
void addArrays(int* , int* , int* , int );
void display(int* , int );

void main() {
    int num = 5;   // fixed size = 5

    int arr[num], brr[num], crr[num];

    // input arrays
    printf("Enter 5 elements of array1:\n");
    store(arr, num);

    printf("Enter 5 elements of array2:\n");
    store(brr, num);

    // add arrays
    addArrays(arr, brr, crr, num);

    // display result
    printf("Addition of array1 and array2 elements:\n");
    display(crr, num);
}

void store(int* ptr, int num) {
    for (int i = 0; i < num; i++) {
        scanf("%d", &ptr[i]);
    }
}

void addArrays(int* arr, int* brr, int* crr, int num) {
    for (int i = 0; i < num; i++) {
        crr[i] = arr[i] + brr[i];
    }
}

void display(int* ptr, int num) {
    for (int i = 0; i < num; i++) {
        printf("%d\n", ptr[i]);
    }
}
