// Find Sum of first and last digit of given number. 
// Input: n = 12345 
// Output: 6 (1 + 5)

#include<stdio.h>
void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int last = n%10;
    while(n>=10){
        n = n/10;
    }

    int first = n;

    printf("%d + %d = %d",first,last,(first+last));
}