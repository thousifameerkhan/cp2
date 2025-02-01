package org.cp;

public class specialArray {

    public boolean isArraySpecial(int[] nums) {

        int arr_len = nums.length;
        boolean result;

        if(arr_len == 1)
            return true;
        else
        {
            int k = nums[0];

            for(int p=0;p<arr_len-1;p++)
            {
                k = nums[p+1]^nums[p];

                if (k%2 == 0)
                {
                    result = false;
                    return result;

                }
            }
            result = true;
        }
        return result;
    }
}
