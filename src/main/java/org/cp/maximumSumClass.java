package org.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class maximumSumClass {

public int sumOfDigits(int n)
{
    int count =0;
    for(char c : (""+n).toCharArray())
        count = count + (c-'0');
    return count;
}

public int maxSuminList(ArrayList<Integer> a)
{
    int sum = 0;
    int max =0;
    for(int i=0;i<a.size();i++)
    {
        for(int j=i+1;j<a.size();j++)
        {
            sum=a.get(i)+a.get(j);
            max = Math.max(max,sum);
        }

    }
    return max;
}

public int maximumSum(int[] nums) {
    int key;
    Map<Integer, ArrayList<Integer>> m1 = new HashMap<Integer, ArrayList<Integer>>();

    for(int i:nums)
    {
        key = sumOfDigits(i);
        //System.out.println("key : "+key);
        ArrayList<Integer> temp = new ArrayList<>();
        if(m1.containsKey(key)) {
            temp = m1.get(key);
            temp.add(i);
        }
        else
        {
            temp.add(i);
        }
        m1.put(key,temp);

    }

    int max = -1;
    for (Integer key1 : m1.keySet()) {


        if(m1.get(key1).size() > 1)
        {
//            System.out.println("multiple "+key1 + " size "+m1.get(key1).size());
//
//            for(int k=0;k<m1.get(key1).size();k++)
//            {
//                System.out.println(" "+m1.get(key1).get(k));
//            }


            max = Math.max(max,maxSuminList(m1.get(key1)));
        }

    }

    return max;

}


}
