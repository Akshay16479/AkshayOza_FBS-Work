#include<stdio.h>

int isPerfect();  

void main()
{
    if(isPerfect())        
        printf("No is Perfect");
    else
        printf("No is Not Perfect");
}

int isPerfect()   
{
    int num=28,sum=0, i=1,temp=num;

    for(i; i<num; i++)     
    {
        if(num%i==0)
         sum=sum+i;
    }

    if(temp==sum)
        return 1;   // true
    else
        return 0;   // false
}

