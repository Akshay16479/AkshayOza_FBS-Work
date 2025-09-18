#include <stdio.h>

void store(int* , int );
void checkPrime(int* , int );

void main() {
    int arr[5];
    store(arr, 5);
    checkPrime(arr, 5);


}

void store(int* arr, int n)
 {
    printf("Enter %d numbers: ", n);
    for (int i = 0; i < n; i++)
	{
        scanf("%d", &arr[i]);
    }
}

void checkPrime(int* arr, int n) 
{
    for (int i = 0; i < n; i++) 
	{
        int no = arr[i], count = 0;

        for (int j = 1; j <= no; j++) 
		{
            if (no % j == 0)
                count++;
        }

        if (count == 2)
            printf("%d is Prime\n", no);
        else
            printf("%d is Not Prime\n", no);
    }
}
