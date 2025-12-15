// Write a program to check whether a person is eligible to vote (age ≥ 18).

#include<stdio.h>

void main(){
    printf("Enter age: ");
    int age;
    scanf("%d", &age);

    if(age >= 18) printf("Your eligible to vote.");
    else printf("Your not eligible.");
}