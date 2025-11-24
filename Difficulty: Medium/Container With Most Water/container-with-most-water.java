class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;

        int left = 0, right = n -1, maxlength = 0;
        while(left < right) {
            int length = Math.min(arr[left], arr[right]);
            int width = right - left;

            int area = length * width;
            if(area > maxlength) {
                maxlength = area;
            }
            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxlength;
    }
}