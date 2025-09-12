#include <stdio.h>

void main() 
{
    int arr[5], rev[5];

    // Input array elements
    printf("Enter array elements:\n");
    for(int i = 0; i < 5; i++) 
	{
        scanf("%d", &arr[i]);
    }

    // Reverse array
    printf("Reverse of given Array is :");
    for(int i = 0; i < 5; i++)
	{
        rev[i] = arr[5 - 1 -i];
        printf("%d\n ", rev[i]);
    }

    
}
