#include<stdio.h>
#include<stdbool.h>

// Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.
// For example, for the input [1, 2, 3, 10], you should return 7.
// Do this in O(N) time.

bool sumOfSubset();

int main(){

    int sortedIntegers[] = {1, 2, 3, 10};
    int size = sizeof sortedIntegers / sizeof sortedIntegers[0];
    int last = sortedIntegers[size - 1];

    int i, result = -1;
    int counter = 0;

        
    for(i = 1; i < last; i ++)
    {
        if ((sortedIntegers[counter] > i)){
            if (sumOfSubset(i, sortedIntegers[counter - 1]))
            {
                result = i;
                break;
            } else {
                counter --;
            }
        }
        counter ++;
    }

    if(result > 0){
        printf("Result: %d\n", i);
    } else {
        printf("No possible result!\n");
    }

}

bool sumOfSubset(int sum, int lastElementSubset){
    // Gauss sum
    int maxSubsetSum = lastElementSubset * (lastElementSubset + 1) / 2;
    if (sum <= maxSubsetSum){
        return false;
    }
    return true;
}