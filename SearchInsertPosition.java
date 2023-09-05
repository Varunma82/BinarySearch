// Problem Statement
// Suggest Edit
// You are given a sorted array 'arr' of distinct values and a target value 'm'.


// You need to search for the index of the target value in the array.


// Note:
// If the value is present in the array, return its index.
// If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order. 


// Example:
// Input:  arr = [1, 2, 4, 7],  m = 6 

// Output: 3

// Explanation: If the given array 'arr' is: [1, 2, 4, 7] and m = 6. We insert m = 6 in the array and get 'arr' as: [1, 2, 4, 6, 7]. The position of 6 is 3 (according to 0-based indexing)



public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
