#include <stdio.h>

void store(int* , int );
void merge(int* , int* , int* , int );
void display(int* , int );

void main() {
    int arr[5], brr[5], crr[10];

    printf("Enter 5 elements of array1:\n");
    store(arr, 5);

    printf("Enter 5 elements of array2:\n");
    store(brr, 5);

    // merge arrays
    merge(arr, brr, crr, 5);

    // display merged array
    printf("Merged array elements are:\n");
    display(crr, 10);
}

// store elements
void store(int* arr, int num) 
{
    for (int i = 0; i < num; i++) 
	{
        scanf("%d", &arr[i]);
    }
}

// merge arrays
void merge(int* arr, int* brr, int* crr, int num) 
{
    for (int i = 0; i < num; i++) 
	{
        crr[i] = arr[i];        // copy arr
    }
    for (int i = 0; i < num; i++) 
	{
        crr[i + num] = brr[i];  // copy brr after arr
    }
}

// display array
void display(int* arr, int num) 
{
    for (int i = 0; i < num; i++)
	{
        printf("%d\n", arr[i]);
    }
}
