class Solution {
    public int subarraySum(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                count++;
            }
        }

        return count;
    }
}