package org.cp;

public class applyOperationsClass {


    public int[] transform(int i,int[] a)
    {
        a[i] = 2 *a[i];
        a[i+1] = 0;
        return a;
    }
    public int[] pushBackZeros(int[] b)
    {
        int[] zeroBack = new int[b.length];
        int  count = 0;
        for(int i:b)
        {
            if(i!=0)
            {
                zeroBack[count] = i;
                count++;
            }

        }
        while(count < b.length)
        {
            zeroBack[count] =0;
            count++;
        }

        return zeroBack;
    }

    public int[] applyOperations(int[] nums) {


        for(int i=0;i<nums.length-1;i++)
        {
            if (nums[i] == nums[i+1]) {
                nums = transform(i,nums);
            }
        }

        nums = pushBackZeros(nums);
        return nums;
    }
}
