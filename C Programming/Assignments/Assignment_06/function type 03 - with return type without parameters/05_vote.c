// Write a program to check whether a person is eligible to vote (age ≥ 18). 

#include<stdio.h>

int voteEligibilty(){
    int age;
    printf("Enter age: ");
    scanf("%d",&age);

    if(age >= 18){
        return 1;
    }
    else{
        return 0;
    }
}

void main(){
    
    int flag=voteEligibilty();
    
    if(flag==1) printf("You can vote");
    else printf("You can not vote");
    
}