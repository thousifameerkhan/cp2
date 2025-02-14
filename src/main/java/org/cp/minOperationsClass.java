package org.cp;

import java.util.PriorityQueue;

public class minOperationsClass {




    public int minOperations(int[] nums, int k) {

        int count = 0;
        PriorityQueue<Integer> min_p = new PriorityQueue<Integer>(nums.length);

        for(int i: nums)
            min_p.offer(i);

        //System.out.println(" Peek : "+ min_p.peek() + " Size : "+ min_p.size());
        while((!min_p.isEmpty() )&& (min_p.peek()<k) && (min_p.size()>=2))
        {
            int i = min_p.poll();
            int j = min_p.poll();
            Long k1 = (long)(2*i +j);
            if (k1 <= 1000000000) {
                min_p.offer(k1.intValue());
                count++;
            }
        }


        return count;
    }



}
