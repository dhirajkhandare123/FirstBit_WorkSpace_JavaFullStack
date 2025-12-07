// Write a C program to input marks of five subjects, find the total marks, and 
// calculate the percentage. 

#include<stdio.h>
void main(){
    int s1,s2,s3,s4,s5;
    printf("Enter marks: /n");
    scanf("%d", &s1);
    scanf("%d", &s2);
    scanf("%d", &s3);
    scanf("%d", &s4);
    scanf("%d", &s5);

    float percentage = ((s1+s2+s3+s4+s5)/500.0)*100;

    printf("Percenntage: %.2f", percentage);
}