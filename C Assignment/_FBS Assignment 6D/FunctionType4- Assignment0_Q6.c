#include <stdio.h>


int swapA(int, int );
int swapB(int , int );

void main()
{
    int a = 5, b = 8;

    int res1 = swapA(a, b);   
    int res2 = swapB(a, b);   

    printf("Swapping is %d and %d\n", res1, res2);
}


int swapA(int a, int b)
{
    return b;   // after swap, a becomes b
}


int swapB(int a, int b)
{
    return a;   // after swap, b becomes a
}

