package org.cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class tupleSame {



    public int tupleSameProduct(int[] nums) {

        int len =nums.length;
        int res =0;

        if (len < 4)
            return 0;

        int j;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0 ;i<len-1;i++)
        {
            for(j=i+1;j<len;j++)
            {
                int prod = nums[i]*nums[j];
                if(m.containsKey(prod))
                {
                    int freq = m.get(prod);
                    m.put(prod,freq+1);
                }else
                {
                    m.put(prod,1);
                }

            }
        }
        //System.out.println(Arrays.asList(m));

        for(int i : m.keySet())
        {
            System.out.println(i);
            if(m.get(i) > 1)
            {

                int count =  m.get(i);

                res += count * (count - 1) * 4;
            }
        }

        return res;
    }

}
