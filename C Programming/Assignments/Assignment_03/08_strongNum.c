// Check the given number is Strong number or not. 
// Input: n = 145 
// Output: Strong

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int sum = 0;
    int rem;
    int temp = n;

    while(temp!=0){
        rem = temp % 10;
        int fact = 1;

        for(int i=1;i<=rem;i++){
            fact*=i;
        }
        sum+=fact;
        temp=temp/10;
    }

    if(sum == n) printf("Strong Number");
    else printf("Not a Strong Number");

}

// Strong Number: Sum of factorial of its digits is equal to number itself.