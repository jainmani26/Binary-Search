class Solution {
    public int findPeakElement(int[] arr) 
    {
        int low = 0, high = arr.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            long lval = (mid - 1 >= 0) ? arr[mid - 1]: Long.MIN_VALUE ;
            long rval =(mid + 1 < arr.length) ? arr[mid + 1]: Long.MIN_VALUE ;
            
            if((long)arr[mid] > lval && (long)arr[mid] > rval) //if mid is maximum
            {
                return mid;
            }
            else if(lval > (long)arr[mid]) //if left range is strictly increasing
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
