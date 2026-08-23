class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length, n = grid[0].length;
        k %= m * n;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int x = (i * n + j - k + m * n) % (m * n);
                row.add(grid[x / n][x % n]);
            }

            ans.add(row);
        }

        return ans;
    }
}