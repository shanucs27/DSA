class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time = 0;
        long totalWait = 0;

        for (int[] c : customers) {
            time = Math.max(time, c[0]) + c[1];
            totalWait += time - c[0];
        }

        return (double) totalWait / customers.length;
    }
}