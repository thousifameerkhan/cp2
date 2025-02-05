package org.cp;

public class almostEqual {


    public boolean areAlmostEqual(String s1, String s2) {
        boolean res = false;
        int count = 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int k1,k2;
        k1 = k2 = 0;
        for(int i=0;i<c1.length;i++)
        {
            freq1[c1[i]-'a']++;
            freq2[c2[i]-'a']++;
            int k = c1[i] ^ c2[i];

            if(k != 0)
            {
                if(count == 0)
                    k1 = k;
                else
                    k2 = k;
                count++;
            }


            if (count > 2 )
                return false;
        }

        if(count == 0 || ( (count == 2 )&& ((k1 ^ k2) == 0 ) ))
        {
            int q =0;
            for(int p=0;p<26;p++)
            {
                if (freq1[p] != freq2[p]) {
                    q=1;
                    break;
                }

            }
            if(q==1)
                res = false;
            else
                res = true;
        }



        return res;
    }


}
