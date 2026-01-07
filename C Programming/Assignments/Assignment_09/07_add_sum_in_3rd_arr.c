// Take two array and add sum in third array
// Example-
// arr[5]= {1,2, 3, 4,5}
// brr[5]={10,20,30, 40, 50}
// crr[5]={11,22,33,44,55}

#include <stdio.h>

int addInThirdArray(int n, int crr[], int idx, int size)
{
    crr[idx] = n;
}

void display(int arr[], int n)
{
    printf("\narray: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

void main()
{

    int arr[5] = {1, 2, 3, 4, 5};
    int brr[5] = {10, 20, 30, 40, 50};
    int crr[5];
    for (int i = 0; i < 5; i++)
    {
        addInThirdArray(arr[i] + brr[i], crr, i, 5);
    }

    display(crr, 5);
}