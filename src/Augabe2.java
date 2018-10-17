public class Augabe2 {
    private static int maxPartialSum(int... numbers) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : numbers) {
            int newSum = currentSum + num;
            currentSum = (newSum > num) ? newSum : num;
            
            if (currentSum > max) {
                max = currentSum;
            }
        }
        
        return max;
    }
    
    
    private static int maxPartialSum2d(int[][] numbers) {
        int max = Integer.MIN_VALUE;
    
        int numRows = numbers.length;
        int numCols = numbers[0].length;
        
        for (int startRow = 0; startRow < numRows; startRow++) {
            int[] temp = new int[numCols];
            
            for (int endRow = startRow; endRow < numRows; endRow++) {
                for (int i = 0; i < numCols; i++) {
                    temp[i] += numbers[endRow][i];
                }
    
                int currentSum = maxPartialSum(temp);
                if (currentSum > max) {
                    max = currentSum;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };
        
        System.out.println(maxPartialSum2d(matrix));
    }
    
}
