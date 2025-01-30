package org.cp;

public class mergeSort {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m+n];
        int i, j;
        i=j=0;

        int k = 0;
        while(i<m && j<n)
        {
            if(nums1[i] <= nums2[j])
            {
                temp[k] = nums1[i];
                i++;
                k++;
            }
            else
            {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<m)
        {
            temp[k] = nums1[i];
            k++;
            i++;
        }

        while(j<n)
        {
            temp[k] = nums2[j];
            k++;
            j++;
        }



        for(int q=0;q<m+n;q++)
        {
            nums1[q] = temp[q];
        }

//        for(int p : nums1)
//        {
//            System.out.print(p + " ");
//        }



    }




}
