// Write a program to check whether a number is even or odd.

#include<stdio.h>

int oddEven(){
    printf("Enter: ");
    int n;
    scanf("%d",&n);
    int flag=0;
    if(n%2 == 0) return 1;
    else return 0;
}

void main(){
    printf("Check Odd Even numbers: \n");
    char flag = oddEven();

    if(flag==1) printf("Even");
    else printf("Odd");
}