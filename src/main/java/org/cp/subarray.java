package org.cp;

public class subarray {

    public int longestMonotonicSubarray(int[] nums) {


        int max = 1;
        int n = nums.length;
        if(n == 1)
            return 1;
        else
        {
            int first = 0;
            int second = 1;

            // code for increasing sub array

            int count =1;
            int temp = nums[first];
            while(second < n && first < n)
            {
                if( temp < nums[second] )
                {
                    temp = nums[second];
                    second++;
                    count++;
                }
                else
                {
                    count = second-first;
                    max = Math.max(max,count);
                    count = 0 ;
                    temp = nums[second];
                    first = second;
                    second = second+1;

                }
                max = Math.max(max,count);



            }

            // code for decreasing sub array

            first = 0;
            second = 1;

            int count1 =1;
            int temp1 = nums[first];
            while(second < n && first < n)
            {
                if( temp1 > nums[second] )
                {
                    temp1 = nums[second];
                    second++;
                    count1++;
                }
                else
                {
                    count1 = second-first;
                    max = Math.max(max,count1);
                    count1 = 0;
                    temp1 = nums[second];
                    first = second;
                    second = second+1;

                }
                max = Math.max(max,count1);



            }



        }
        return max;

    }





}
