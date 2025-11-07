#include <stdio.h>

void main()
{
    int i, j;

    //  Upper sidee
    for(i = 1; i <= 4; i++)
    {
        for(j = i; j < 5; j++)
            printf(" "); 
        
        for(j = 1; j <= (2*i - 1); j++)
        {
            if(i == 4 || j == 1 || j == (2*i - 1))
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }

    // Lower 
    for(i = 3; i >= 1; i--)
    {
        for(j = 4; j > i; j--)
            printf(" ");  
        
        for(j = 1; j <= (2*i - 1); j++)
        {
            if(j == 1 || j == (2*i - 1))
                printf(" *");
            else
                printf(" ");
        }
        printf("\n");
    }
 // below lines
  for(i = 1; i <= 5; i++)
{
    for(j = 1; j <= 4; j++)
        printf(" "); 
    printf("** \n");
}

   
}
