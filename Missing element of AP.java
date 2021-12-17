class Solution {
    int findMissing(int[] arr, int n) {
        int low = 0, high = n - 1;
        int ans = 0;
        int commDiff = (arr[n - 1] - arr[0]) / n;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            int actualVal = arr[mid];
            int expectedVal = arr[0] + commDiff * mid;
            
            if(actualVal == expectedVal)
            {
                low = mid + 1;
            }
            else
            {
                ans = expectedVal;
                high = mid - 1;
            }
        }
        return ans;
    }
}
