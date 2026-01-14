// Write a program to check whether a person is eligible to vote (age ≥ 18). 

#include<stdio.h>

int voteEligibilty(int age){
    
    if(age >= 18){
        return 1;
    }
    else{
        return 0;
    }
}

void main(){
    int age;
    printf("Enter age: ");
    scanf("%d",&age);

    
    int flag=voteEligibilty(age);
    
    if(flag==1) printf("You can vote");
    else printf("You can not vote");
    
}