#include<stdio.h>
void main()
{
	int arr[5]={1,2,3,4,5};
	Alternate(arr);
}

void Alternate(int*arr)
{
	int sum=0;
	for(int i=0;i<5;i=i+2)
	{
	  sum=sum+arr[i];
    }
     printf("%d",sum);
}