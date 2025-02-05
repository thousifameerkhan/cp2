package org.cp;
import java.util.ArrayList;

public class maxSumSubArray {



    public ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> a  = new ArrayList<>();
        int arr_length = arr.length;
        if( arr_length == 1)
        {
            if( arr[0] == target )
                a.add(1);
            else
                a.add(-1);

            return a;
        }

        else
        {

            if( arr[0] == target ) {
                a.add(1);
                return a;
            }
            else
            {
                int first = 0;
                int second = 1;

                int sum  = arr[first];
                while(second < arr_length || sum == target)
                {
                    if(sum == target)
                    {
                        a.add(first+1);
                        a.add(second);

                        return a;
                    }
                    else if(sum <  target)
                    {

                        sum = sum +arr[second];
                        second = second +1;
                    }
                    else if(sum >  target)
                    {
                        sum = sum - arr[first];
                        first = first+1;
                    }
                }

                if(second == arr_length)
                {
                    a.add(-1);
                }


            }


        }

        return a;
    }


}
