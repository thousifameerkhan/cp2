package org.cp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dfs2DArray d = new Dfs2DArray();

       // int[][] grid = {{0,2,1,0},{4,0,0,3},{1,0,0,4},{0,3,2,0}};

       // int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,1}};

        int[][] grid = {{3,10,5,8}};

        //System.out.println(d.findMaxFish(grid));

        //String s = "MCMXCIV";
        //romanToInteger r = new romanToInteger();

        //System.out.println(r.romanToInt(s));

//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

        mergeSort ms = new mergeSort();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m1 = 3;
        int n1 = 3;

        ms.merge(nums1,3,nums2,n1);


    }



}