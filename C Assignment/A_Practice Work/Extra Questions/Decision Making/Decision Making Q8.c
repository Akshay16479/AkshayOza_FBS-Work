#include <stdio.h>

void main()
{
    int num;        
    int a = 2;      
    int p = 1;      
    int i;
    printf("Enter how many terms: ");
    scanf("%d", &num);

    for( i = 1; i <= num; i++)
    {
        p = p * a;     
        printf("%d\n ", p);
    }
    
}

