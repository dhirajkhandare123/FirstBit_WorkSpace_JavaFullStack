// Print a half pyramid using numbers 
// Input: n = 5 
// Output: 
//      1 
//     1 2 
//    1 2 3 
//   1 2 3 4 
//  1 2 3 4 5 

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            printf(" ");
        }
        for(int k=1;k<=i;k++){
            printf("%d ",k);
        }
        printf("\n");
    }
}