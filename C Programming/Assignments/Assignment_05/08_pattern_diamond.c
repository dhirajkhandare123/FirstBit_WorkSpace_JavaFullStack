// Print a pattern of stars in diamond shape 
// Input: n = 4 
// Output: 
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

#include<stdio.h>

void main(){
    printf("Enter number of lines: ");
    int n;
    scanf("%d",&n);

    int nsp=n;
    int nst=1;

    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=nsp;j++){
            printf(" ");
        }
        if(i<=n-1) nsp--;
        else nsp++;

        // stars
        for(int k=1;k<=nst;k++){
            printf("*");
        }
        if(i<=n-1) nst+=2;
        else nst-=2;

        printf("\n");
    }
    

}