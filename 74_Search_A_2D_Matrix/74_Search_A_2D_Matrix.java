public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        int left = 0; 
        int right = row*col-1;
        int mid;
        while(left <= right){
            mid = left+(right-left)/2;
            int i = mid/col;
            int j = mid%col;
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
}
