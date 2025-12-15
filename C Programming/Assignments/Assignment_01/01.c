// Write a program to check whether a number is even or odd.

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d",&n);

    if(n%2==0) printf("Number is even.");
    else printf("Number is odd.");
}