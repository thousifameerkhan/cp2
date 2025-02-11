package org.cp;

public class removeOccurrencesClass {


    private String removeFirst(String a ,String b_subString)
    {
        StringBuilder sb = new StringBuilder(a);
        int index = sb.indexOf(b_subString);
        if(index != -1)
            sb.delete(index,index+b_subString.length());
        else
            return "999";

        return sb.toString();
    }



    public String removeOccurrences(String s, String part) {
        if(part.length() > s.length())
            return "";
        else
        {
            while(removeFirst(s,part) != "999")
            {
                s = removeFirst(s,part);
            }
        }

        return s;
    }

}
