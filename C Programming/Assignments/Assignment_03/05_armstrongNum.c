// Check the given number is Armstrong number or not.. 
// Input: n = 153 
// Output: Armstrong 

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d",&n);

    int temp=n;
    int digits=0;

    while(temp!=0){
        temp=temp/10;
        digits++;
    }

    temp=n;
    int rem;
    int result = 0;

    while(temp!=0){
        rem = temp % 10;
        int pow = 1;
        for(int i=1;i<=digits;i++){
            pow = pow * rem;
        }
        result = result + pow;
        
        temp=temp/10;
    }
    

    if(n == result) printf("%d is Armstrong number",n);
    else printf("%d is not a Armstrong number",n);
}