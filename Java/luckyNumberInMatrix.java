// problem link :  https://leetcode.com/problems/lucky-numbers-in-a-matrix/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         ArrayList<Integer> list = new ArrayList<>();
        int k=0;
        for(int i=0;i<matrix.length;i++){
            int minValue = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j] < minValue){
                minValue = matrix[i][j];
                  k=j;
               }
            }
            int maxValue = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][k] > maxValue){
                   maxValue = matrix[j][k];
                  }   
        }    
            if(minValue == maxValue){
                list.add(minValue);
            }
    }
    return list;
    }
}
