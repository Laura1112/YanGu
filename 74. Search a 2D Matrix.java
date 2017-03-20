//题意：在一个从上到下、从左到右正序排列的二位矩阵中，寻找是否存在一个数

//首先特殊情况处理（1）matrix==null或matrix.length==0或matrix[0].length==0 （2）target<matrix[0][0]或target>matrix[row-1][col-1]都返回false
//排除以上情况后，比对每行最后一个数和目标值，找到目标值所在的行，然后遍历该行确定是否存在目标值
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)      return false;
        int row = matrix.length;
        int col = matrix[0].length;
        if(target<matrix[0][0]||target>matrix[row-1][col-1])
            return false;
        int i=0;
        while(matrix[i][col-1]<target)
            i++;
        int j=0;
        while(matrix[i][j]<target)
            j++;
        if(matrix[i][j]==target)
            return true;
        else
            return false;
    }
}