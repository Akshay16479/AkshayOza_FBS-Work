#include<stdio.h>
void main() 
{
    int arr[5];
   
    printf("Enter 5 numbers: ");
    for(int i=0; i<5; i++)
    {
        scanf("%d", &arr[i]);
    }

   
    for(int i=0; i<5; i++)
    {
        int no = arr[i], count = 0;

        for(int j=1; j<=no; j++)
        {
            if(no % j == 0)
                count++;
        }

        if(count == 2)
            printf("%d is Prime\n", no);
        else
            printf("%d is Not Prime\n", no);
    }
}
