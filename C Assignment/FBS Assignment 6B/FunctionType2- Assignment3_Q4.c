#include<stdio.h>

int isArmstrong();                                        // function declaration

void main()
{
    if(isArmstrong())                                    // call and check return
        printf("Number is Armstrong");
    else
        printf("Number is Not Armstrong");  
}

int isArmstrong()                                        // function definition
{
    int num=153, arm=0, p;
    int temp=num;

    for(num; num>0; )
    {
        p=num%10;
        arm=arm+(p*p*p);
        num=num/10;
    }

    if(temp==arm)
        return 1;   // true
    else
        return 0;   // false
}

