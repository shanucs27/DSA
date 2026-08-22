import java.util.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] a = nums.clone();
        Arrays.sort(a);

        int l = 0, r = nums.length - 1;

        while (l < nums.length && nums[l] == a[l]) l++;
        while (r >= 0 && nums[r] == a[r]) r--;

        return l > r ? 0 : r - l + 1;
    }
}