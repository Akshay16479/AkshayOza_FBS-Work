#include<stdio.h>

struct Distance
{
    int feet;
    int inch;
};

void main()
{
    struct Distance d1;
    
    printf("Enter feet : ");
    scanf("%d", &d1.feet);
    
    printf("Enter inches : ");
    scanf("%d", &d1.inch);
    
    printf("Distance = %d feet %d inches", d1.feet, d1.inch);
}
