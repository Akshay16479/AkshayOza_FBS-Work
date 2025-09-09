#include <stdio.h>

void main() {
    int num = 36;  
    int i;

    for(i = 1; i <= num; i++) 
	{
        if(num % i == 0) 
            printf("%d\n",i);
        
    }

    
    
}

