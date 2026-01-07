// Merge two arrays

#include<stdio.h>

void mergeTwoArray(int arr[], int n, int brr[], int m){
    int i=0;
    int j=0;
    int k=0;

    int res[n+m];

    while(i<=n-1 && j<=m-1){
        if(arr[i]<brr[j]){
            res[k] = arr[i];
            i++;
        }

        else{
            res[k] = brr[j];
            j++;
        }
        k++;
    }

    if(i == n){
        while(j <= m-1){
            res[k] = brr[j];
            j++;
            k++;
        }
    }

    if(j == m){
        while(i <= n-1){
            res[k] = arr[i];
            i++;
            k++;
        }
    }

    for(int i=0;i<n;i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    for(int i=0;i<m;i++){
        printf("%d ", brr[i]);
    }
    printf("\n");

    for(int i=0;i<k;i++){
        printf("%d ", res[i]);
    }
    printf("\n");
}

void main(){
    int arr[5] = {1, 4, 2, 7, 9};
    int n = sizeof(arr)/sizeof(int);

    int brr[4] = {3, 5, 6, 8};
    int m = sizeof(brr)/sizeof(int);

    mergeTwoArray(arr, n, brr, m);

}