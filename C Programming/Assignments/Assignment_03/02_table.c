// Print table for given number. 
// Input: n = 5 
// Output: 5 10 15 20 25 30 35 40 45 50 

// Using for loop

// #include<stdio.h>

// void main(){
//     printf("Enter: ");
//     int n;
//     scanf("%d", &n);

//     for(int i=1;i<=10;i++){
//         printf("%d X %d = %d\n",n,i,n*i);
//     }
// }

// Using while loop

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int i=1;

    while(i<=10){
        printf("%d X %d = %d\n",n,i,n*i);
        i++;
    }
}