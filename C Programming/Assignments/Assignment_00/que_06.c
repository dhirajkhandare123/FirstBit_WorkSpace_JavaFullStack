// Write a C program to find the square and cube of a given number.

#include<stdio.h>
void main(){
    printf("Enter: ");
    int n;
    scanf("%d",&n);
    int sq=n*n;

    printf("Squre: %d",sq);
    printf("\nCube: %d",(n*n*n));
}