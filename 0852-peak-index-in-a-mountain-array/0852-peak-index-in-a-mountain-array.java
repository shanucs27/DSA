class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
    while(s <= e){
        int mid = s + (e-s)/2;

        if(arr[mid] < arr[mid+1]){
            //main ascending order wale part me hu
            //iska  mtlb main left part me hu
            // or mujhe pta h answer right me h
            // toh fatfat right part me move kro
            s = mid + 1;
        }
        else{
            //arr[mid] >= arr[mid+1]
            // iska mtlb gain right part me hu
            // iska mtlb main ek potential solution pr khada hu
            ans = mid;
            // now i have to find the final solution
            // mujhe pata hai right part descending order wala h
            // toh bada number agar exist krta h, toh pakka left me hi milega
            // left me move kro
            e = mid - 1;
        }
    }
    return ans;
    }
}