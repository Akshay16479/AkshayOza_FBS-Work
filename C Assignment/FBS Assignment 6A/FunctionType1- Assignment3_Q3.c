#include <stdio.h>
void numAdd();
void main()
{
  numAdd();
}

void numAdd()
{
  int num=1,sum=0;
  for(num=1;num<=5;num++)
  {
    sum=sum+num;
  }
	printf("%d",sum);
}
