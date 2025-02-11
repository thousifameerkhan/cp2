package org.cp;

public class longestSubstringWORepeating {

    public int lengthOfLongestSubstring(String s) {
        int max_count = 0;
        int first = 0;
        int str_len = s.length();

        if(str_len == 0)
            return 0;

        char[] char_array = s.toCharArray();



        while(first < str_len)
        {
            int count = 0;
            int[] char_freq = new int[26];
            for(int i = first;i<str_len;i++)
            {
                if (char_freq[char_array[i]-'a'] == 0){
                    char_freq[char_array[i]-'a']++;
                    count++;

                }
                else
                {
                    max_count = Math.max(max_count,count);
                    break;
                }
            }
            first++;

        }


        return max_count;
    }


}
