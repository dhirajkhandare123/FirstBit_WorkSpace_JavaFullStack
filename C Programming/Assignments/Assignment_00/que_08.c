// Write a C program to input the length and width of a rectangle and find its perimeter

#include<stdio.h>
void main(){
    int len,width;
    printf("Enter length: ");
    scanf("%d",&len);

    printf("Enter width: ");
    scanf("%d", &width);

    printf("Perimeter: %d",2*(len+width));
}