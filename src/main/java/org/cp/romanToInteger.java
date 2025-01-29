package org.cp;

import java.util.HashMap;

public class romanToInteger {



    HashMap<Character,Integer> h = new HashMap<>();
    HashMap<String,Integer> h1 = new HashMap<>();

    private HashMap<Character,Integer> populate_hashmap()
    {
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);

        return h;
    }

    private HashMap<String,Integer> populate_hashmap2()
    {
        h1.put("IV", 4);
        h1.put("IX", 9);
        h1.put("XL", 40);
        h1.put("XC", 90);
        h1.put("CD", 400);
        h1.put("CM", 900);

        return h1;
    }

    public int romanToInt(String s) {

        int result = 0;
        populate_hashmap();
        populate_hashmap2();

        char[] char_array = s.toCharArray();
        int len = char_array.length;

        for(int i=0;i<len;i++)
        {
            if((char_array[i] == 'I' || char_array[i] == 'X' || char_array[i] == 'C' ) && ((i+1) < len)) {

                switch (char_array[i]) {
                    case 'I':
                        // Code to execute if expression == value1
                        if (char_array[i + 1] == 'V' || char_array[i + 1] == 'X') {

                            String combinedString = "" + char_array[i] + char_array[i + 1];
                            result = result + h1.get(combinedString);
                            i = i + 1;
                        }
                        else {

                            result = result + h.get(char_array[i]);
                        }



                        break; // Important: Prevents fallthrough
                    case 'X':
                        if (char_array[i + 1] == 'L' || char_array[i + 1] == 'C') {

                            String combinedString = "" + char_array[i] + char_array[i + 1];
                            result = result + h1.get(combinedString);
                            i = i + 1;
                        }
                        else {

                            result = result + h.get(char_array[i]);
                        }
                        break;
                    case 'C':
                        // Code to execute if expression == value3
                        if (char_array[i + 1] == 'D' || char_array[i + 1] == 'M') {

                            String combinedString = "" + char_array[i] + char_array[i + 1];
                            result = result + h1.get(combinedString);
                            i = i + 1;
                        }
                        else {

                            result = result + h.get(char_array[i]);
                        }
                        break;

                }

            }
            else {

                result = result + h.get(char_array[i]);
            }
        }
        return result;
    }


}
