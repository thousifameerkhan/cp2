package org.cp;

public class diffMaxFreq {


    public int maxDifference(String s) {

        int res= 0;
        char[] char_array  = s.toCharArray();

        int[] freq = new int[26];

        for(char c :char_array)
        {
            freq[c-'a']++;
        }


        int minEven,maxOdd;

        minEven  = maxOdd = 0;

        for(int i=0;i<26;i++)
        {
            if(freq[i] > 0) {
                int m = freq[i];
                if (m % 2 == 0) {
                    if (minEven == 0)
                        minEven = freq[i];
                    else
                        minEven = Math.min(minEven, freq[i]);

                   // maxEven = Math.max(maxEven, freq[i]);
                } else {

//                    if (minOdd == 0)
//                        minOdd = freq[i];
//                    else
//                        minOdd = Math.min(minOdd, freq[i]);
                    maxOdd = Math.max(maxOdd, freq[i]);

                }
            }
        }

       //res=  Math.max(Math.abs(minEven-maxOdd),Math.abs(minOdd-maxEven));
        res = maxOdd - minEven;
        return res;

    }

}
