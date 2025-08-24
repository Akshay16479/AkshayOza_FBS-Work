//Sum of numbers in given range.Find sum of numbers from start to end.Input: start = 1, end = 5

#include <stdio.h>

void main()
{
  int num=1;
  int sum=0;
  
  while(num<=5)
  {
  	sum=sum+num;
  	num++;
  }
	printf("%d",sum);
}
    
