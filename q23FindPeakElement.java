/*class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end) {
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]) {
                start=mid+1;
            }
            else {
                end=mid+1;
            }
        }
        return end;
        
    }
} 
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, n = nums.length, right = n - 1;
        //Base case
        if(n == 1) return left;
        
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}