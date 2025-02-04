package org.cp;

public class subArraySumIncreasing {



        public int maxAscendingSum(int[] nums) {
            int len = nums.length;

            if(len == 1 )
                return nums[0];
            else
            {
                int first =0;
                int second = 1;


                int temp = nums[0];
                int sum = temp;
                int res = 0;
                while(second < len)
                {
                    if(temp < nums[second])
                    {
                        sum = sum +nums[second];
                        temp = nums[second];
                        second = second+1;
                    }
                    else
                    {
                        first = second;
                        temp = nums[second];
                        second = second+1;
                        res = Math.max(sum,res);
                        sum = temp;


                    }
                    res = Math.max(sum,res);

                }

                return res;


            }

        }




}
