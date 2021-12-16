class Solution 
{
    public int peakIndexInMountainArray(int[] arr) 
    {
        int low = 0, high = arr.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            int lval = (mid - 1 < 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int rval =(mid + 1 > arr.length) ? Integer.MIN_VALUE : arr[mid + 1];
            
            if(arr[mid] > lval && arr[mid] > rval) //if mid is maximum
            {
                return mid;
            }
            else if(lval > arr[mid]) //if left range is strictly increasing
            {
                high  = mid - 1;
            }
            else                     //if right range is strictly increasing
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}
