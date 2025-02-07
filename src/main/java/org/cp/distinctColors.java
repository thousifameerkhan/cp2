package org.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class distinctColors {

    public int[] queryResults(int limit, int[][] queries) {
        int que_len = queries.length;
        int[] res = new int[que_len];
        Map<Integer,Integer> color_list_freq = new HashMap<Integer,Integer>();
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        res[0] =1;
        color_list_freq.put(queries[0][1],1);
        m.put(queries[0][0],queries[0][1]);

        for(int i=1;i<que_len;i++)
        {
            int x = queries[i][0];
            int y = queries[i][1];
            int old_x_freq = 0;
            boolean remove = false;

            if(m.containsKey(x)) {
                int old_X_color = m.get(x);
                if (color_list_freq.containsKey(old_X_color)) {
                    old_x_freq = color_list_freq.get(old_X_color);
                }
                if (old_x_freq == 1) {
                    color_list_freq.remove(old_X_color);
                    remove = true;

                } else {
                    color_list_freq.put(old_X_color, old_x_freq - 1);
                }
            }


            if(color_list_freq.containsKey(y))
            {
                int freq = color_list_freq.get(y);
                color_list_freq.put(y,freq+1);
                m.put(x,y);

            }else{
                color_list_freq.put(y,1);
                m.put(x,y);

            }

            res[i] = color_list_freq.size();
        }

        return res;
    }


}
