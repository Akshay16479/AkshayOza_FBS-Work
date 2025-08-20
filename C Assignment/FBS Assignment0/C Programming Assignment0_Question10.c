
//Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.

void main() 
{

float subj1,subj2,subj3,subj4,subj5,total_score, percentage;

subj1=75.00;
subj2=92.52;
subj3=87.11;
subj4=66.00;
subj5=71.48;

total_score=(subj1+subj2+subj3+subj4+subj5);
  percentage=(total_score/500.0)*100;

printf("%f,%f",total_score, percentage);



}



