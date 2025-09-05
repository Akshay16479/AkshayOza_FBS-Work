#include <stdio.h>
int voteORnot();
void main()
{
	voteORnot();
	if(voteORnot()==1)
	printf("person is eligible for voting");
	else
	printf("person is not eligible for voting");
	
}
int voteORnot()
{
    int age=17;
    
	if(age>=18)
	return 1;
	
	else
	return 0;
}


