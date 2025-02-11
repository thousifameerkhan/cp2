package org.cp;

import java.util.ArrayList;

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

//        mergeSort ms = new mergeSort();
//
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m1 = 3;
//        int n1 = 3;
//
//        ms.merge(nums1,3,nums2,n1);

        specialArray s = new specialArray();

        //int[] nums1 = {2,1,4};
       // int[] nums1 = {2};
        //System.out.println(s.isArraySpecial(nums1));
//        String s1 = "16";
//        validString v = new validString();
//
//        System.out.println(v.findValidPair(s1));

//        String s2 ="aaaaabbc";
//        String s3 ="abcabcab";
//        String s4 ="tzt";
//
//
//        diffMaxFreq df = new diffMaxFreq();
//        System.out.println(df.maxDifference(s2));
//        System.out.println(df.maxDifference(s3));
//        System.out.println(df.maxDifference(s4));



        //nums = [1,4,3,3,2]
//        int[] nums = {1,4,3,3,2};
//        int[] nums1 = {3,3,3,3};
//        subarray s2 = new subarray();
//
//        System.out.println(s2.longestMonotonicSubarray(nums));
//        System.out.println(s2.longestMonotonicSubarray(nums1));
//        numberFormat n = new numberFormat();
//        n.test();

//        int k;
//        k = 'a'^'b';
//
//        String s1 = "aa";
//        String s2 = "bb";
//        almostEqual e = new almostEqual();
//
//        System.out.println(e.areAlmostEqual(s1,s2));
//        //System.out.println("k : "+k);

//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int target = 15;

//        int arr[] = {1, 2, 3, 7, 5};
//        int target = 12;


//          int arr[] = {2,3,4,6,8,12};
//          //int arr[] = {1,2,4,5,10};
//          tupleSame ts = new tupleSame();
//          //ts.tupleSameProduct(arr);
//          System.out.println(ts.tupleSameProduct(arr));

//         int target = 174;
//         maxSumSubArray m = new maxSumSubArray();
//         ArrayList<Integer> k =  m.subarraySum(arr,target);
//
//        System.out.println("\nMethod 2: Using an enhanced for loop");
//        for (int element : k) {
//            System.out.print(element + " ");
//        }

        //int limit =4;
        //int[][] queries = {{0,1},{1,2},{2,2},{3,4},{4,5}};
//        int limit =4;
//        int[][] queries = {{1,4},{2,5},{1,3},{3,4}};
//        distinctColors d1 = new distinctColors();
//        int[] a = d1.queryResults(limit,queries);
//
//
//        for(int p:a)
//        {
//            System.out.println(p);
//        }
//
//        int[][] queries = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        Array2DSorting a1 = new Array2DSorting();
//        a1.printMatrix(queries);

//        clearDigits_problem c1 =  new clearDigits_problem();
//        //String inp = "121b34degh12";
//        String inp = "cb34";
//        c1.clearDigits(inp);
//
//        char a = '0';
//        char b = 'a';
//        System.out.println(c1.clearDigits(inp));

        //String inp = "abcabcbb";
        //String inp = "bbbbb";
//        //String inp = "pwwkew";
//        String inp = "";
//
//        longestSubstringWORepeating ls = new longestSubstringWORepeating();
//        System.out.println(ls.lengthOfLongestSubstring(inp));

        //String s1 = "daabcbaabcbc";
        //String part = "abc";

        String s1 = "axxxxyyyyb";
        String part = "xy";

        removeOccurrencesClass rO = new removeOccurrencesClass();

        System.out.println(rO.removeOccurrences(s1,part));


    }}



