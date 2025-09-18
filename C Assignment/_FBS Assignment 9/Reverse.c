#include <stdio.h>

void store(int*, int );
void reverse(int* , int* , int );
void display(int* , int );

void main() {
    int arr[5], rev[5];

    printf("Enter 5 elements:\n");
    store(arr, 5);

    reverse(arr, rev, 5);

    printf("Reverse of given array is:\n");
    display(rev, 5);
}

// store elements
void store(int* arr, int num)
{
    for (int i = 0; i < num; i++)
	{
        scanf("%d", &arr[i]);
    }
}

// reverse array
void reverse(int* arr, int* rev, int num)
{
    for (int i = 0; i < num; i++) 
	{
        rev[i] = arr[num - 1 - i];
    }
}

// display elements
void display(int* arr, int num) 
{
    for (int i = 0; i < num; i++) 
	{
        printf("%d\n", arr[i]);
    }
}