package org.cp;

import java.util.ArrayList;

public class validString {


    public String findValidPair(String s) {

        String res = "";
        int[] freq = new int[10];
        char[] char_array = s.toCharArray();

        for(char c: char_array)
        {
            freq[c-'0']++;
        }

        ArrayList<Integer> valid = new ArrayList<>();
        for(int i =1 ;i <10;i++) {
            if (i == freq[i])
                valid.add(i);
        }



        for (int p = 0; p < s.length() - 1; p++) {
            if (char_array[p] != char_array[p + 1]) {
                int m = char_array[p]-'0';
                int n = char_array[p+1]-'0';

                int m1 = freq[m];
                int n1 = freq[n];


                if ( (m == m1) && ( n == n1)    ) {
                    res = "" + char_array[p] + char_array[p + 1];
                    break;
                }
            }
        }


        return res;

    }
}
