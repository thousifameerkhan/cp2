package org.cp;

import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {

    private List<Integer> numbers;
    public ProductOfNumbers() {
        numbers = new ArrayList<>();
    }

    public void add(int num) {
        numbers.add(num);
    }

    public int getProduct(int k) {

        if(k == 0)
            return 0;
        else
        {
            if(k>numbers.size())
                return -1;
            else
            {
                int product =1;
                for(int i = numbers.size()-k ; i< numbers.size() ;i++)
                {
                    product = product* numbers.get(i);
                }
                return product;
            }
        }

    }
}