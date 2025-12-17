//  Print armstrong numbers in the given range 1 to n. 

#include<stdio.h>

void main(){
    int n;
    printf("Enter: ");
    scanf("%d", &n);

    for(int i=1;i<=n;i++){
        int sum=0, temp = i, digits=0, rem;

        int t = temp;
        while(t!=0){
            digits++;
            t=t/10;
        }

        t = temp;
        while(t!=0){
            rem = t % 10;
            int pow=1;
            for(int i=1;i<=digits;i++){
                pow = pow*rem;
            }
            sum=sum+pow;
            t=t/10;
        }
        if(sum==i) printf("%d ", i);
    }
}