// Write a C program to input the base and height of a triangle and calculate its area.

#include<stdio.h>
void main(){
    float base, height;
    printf("Enter Base: ");
    scanf("%f",&base);

    printf("Enter height: ");
    scanf("%f", &height);

    float area = 0.5f * base * height;

    printf("Area: %.2ff", area);
}