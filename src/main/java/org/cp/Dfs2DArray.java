package org.cp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Dfs2DArray {

    private boolean isValid(int i,int j,int row,int col)
    {
        if(i<0 || j< 0)
            return false;
        else if(i < row - 1 && j < col - 1)
            return true;
        else
            return false;
    }


    Queue<pair> q = new LinkedList<>();
    public int findMaxFish(int[][] grid) {
        int result=0;
        int max = 0;
        int rows = grid.length;
        int col = grid[0].length;
        pair[] movArray  =  {new pair(0,1)
                           ,new pair(0,-1)
                           ,new pair(1,0)
                           ,new pair(-1,0)};

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] > 0) {
                    int deep_res = grid[i][j];
                    System.out.println("deep_res : "+deep_res);
                    q.clear();
                    q.add(new pair(i,j));
                    boolean[][] visit = new boolean[rows][col];


                    while(!q.isEmpty()) {

                        pair  a = q.remove();

                        int m = a.getI();
                        int n = a.getJ();
                        visit[m ][n] = true;

                        for (pair p: movArray) {
                            if (isValid(m + p.getI(), n + p.getJ(), rows, col)) {
                                if (!visit[m + p.getI()][n + p.getJ()]) {
                                    deep_res = deep_res + grid[m + p.getI()][n + p.getJ()];
                                    System.out.println("mid result : "+deep_res);
                                    q.add(new pair(m + p.getI(),n + p.getJ()));
                                    //System.out.println("deep_res 1 : "+(m + p.getI()));
                                    //System.out.println("deep_res 2 : "+(n + p.getJ()));
                                    visit[m + p.getI()][n + p.getJ()] = true;
                                }
                            }
                        }
                    }

                    max = Math.max(max, deep_res);
                }
            }
        }






        return max;
    }
}
