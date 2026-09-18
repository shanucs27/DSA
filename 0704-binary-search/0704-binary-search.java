class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = (start + end) / 2;

        while(start <= end){
            //compare target with midValue
            if(nums[mid] == target){
                //target found
                return mid;
            }
            else if(target > nums[mid]){
                //go to right side
                start = mid + 1; 
            }
            else{
                //target < nums[mid]
                end = mid - 1;
            }
            //update mid
            mid = (start + end)/2;
        }

        //agar aap yaha tak aaye h, iska mtlb ye hh
        // target not found
        return -1;
    }
}