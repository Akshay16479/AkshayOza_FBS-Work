void swap();
void main()
{
  swap();
}

void swap()
{
 int a, b, temp;
 a=5,b=8;

temp=a;
a=b;
b=temp;

printf("Swapping is %d and %d",a,b);
}
