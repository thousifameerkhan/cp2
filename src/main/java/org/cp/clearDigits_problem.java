package org.cp;

import java.util.Stack;

public class clearDigits_problem {

    public String clearDigits(String s) {
        String res = "";
        //String res = "abc";

        Stack<Character> char_stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            char c1 = 'a';
            if (c-'a' < 0)
            {
                // integers
                if(!char_stack.isEmpty())
                {
                    char_stack.pop();
                }

                //System.out.println(c);
            }
            else
            {
                /// alphabets
            char_stack.push(c);

            }
        }
        StringBuilder sb = new StringBuilder("");
        char_stack.stream().forEach(c2 -> sb.append(c2)); // iterates from bottom to top of stack
        res=sb.toString();
        return res;
    }


}
