int Tmark();
void main() 
{
	int res=Tmark();
	printf("%d\n",res);
	
	int percentage=(res/500.0)*100;
	printf("%d\n",percentage);
}

int Tmark()
{
float subj1,subj2,subj3,subj4,subj5,total_score, percentage;

subj1=75.00,subj2=92.52,subj3=87.11,subj4=66.00,subj5=71.48;

total_score=(subj1+subj2+subj3+subj4+subj5);
  return total_score;
}


