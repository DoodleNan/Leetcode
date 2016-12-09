public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        int left = 0; 
        int right = row-1;
        int mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(matrix[mid][0] == target) return true;
            else if(matrix[mid][0] < target) left = mid+1;
            else right = mid-1;
        }
        int t = mid;
        for(int i = 0; i<=t; i++){
            left = 0;
            right = col-1;
            while(left<=right){
                mid = left+(right-left)/2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] > target) right = mid-1;
                else left = mid+1;
            }
        }
        return false;
    }
}
