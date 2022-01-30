#include<stdio.h>
#include<stdbool.h>

// Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.
// For example, for the input [1, 2, 3, 10], you should return 7.
// Do this in O(N) time.

bool sumOfSubset();
int gaussSum();
int getMissingSum();

int main(){

    int sortedIntegers[] = {1, 2, 3, 5, 10, 11, 35};
    int size = sizeof sortedIntegers / sizeof sortedIntegers[0];
    int last = sortedIntegers[size - 1];

    int missingSum = 0;

    int i, result = -1;
    int counter = 0;


    bool flag = true;
        
    for(i = 1; i < last && flag; i ++)
    {
        if ((sortedIntegers[counter] > i)){ 

            if (sumOfSubset(i, sortedIntegers[counter - 1], missingSum))
            {
                result = i;
                flag = false;
            } else {    
                counter --;
            }
            
        } else if ((counter > 0) && (sortedIntegers[counter] == i) && (sortedIntegers[counter - 1] != (i - 1))) 
        {
            missingSum += getMissingSum(sortedIntegers[counter - 1], sortedIntegers[counter]);
        }
        counter ++;
    }

    if(result > 0){
        printf("Result: %d\n", result);
    } else {
        printf("Result: %d\n", (sortedIntegers[last] + 1));
    }

}

bool sumOfSubset(int sum, int lastElementSubset, int missingSum){
    // Gauss sum
    int maxSubsetSum = gaussSum(lastElementSubset) - missingSum;
    if (sum <= (maxSubsetSum))
    {
        return false;
    }
    return true;
}

int gaussSum(int number){
    return number * (number + 1) / 2;
}

int getMissingSum (int start, int end){
    int result = 0;
    if (start == 0){return 0;};
    while (start < (end - 1)) {
        start ++;
        result += start;        
    }

    return result;
}