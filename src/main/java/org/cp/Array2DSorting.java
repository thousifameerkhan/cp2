package org.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array2DSorting {

    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diff = i - j;
                diagonals.computeIfAbsent(diff, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        for (int diff : diagonals.keySet()) {
            List<Integer> diag = diagonals.get(diff);
            if (diag != null && !diag.isEmpty()) { // Check for null or empty list
                if (diff >= 0) {
                    Collections.sort(diag, Collections.reverseOrder());
                } else {
                    Collections.sort(diag);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diff = i - j;
                List<Integer> diag = diagonals.get(diff);
                if (diag != null && !diag.isEmpty()) { // Check before accessing
                    grid[i][j] = diag.remove(0);
                }
            }
        }

        return grid;
    }


}
