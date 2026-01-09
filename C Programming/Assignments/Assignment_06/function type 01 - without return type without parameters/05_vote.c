// Write a program to check whether a person is eligible to vote (age ≥ 18). 

#include<stdio.h>

void voteEligibilty(int n){
    if(n >= 18){
        printf("Eligible");
    }
    else{
        printf("Not eligible");
    }
}

void main(){
    int age;
    printf("Enter age: ");
    scanf("%d",&age);

    voteEligibilty(age);
}