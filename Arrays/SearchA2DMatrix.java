public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;

        for (int i = 0; i < matrix.length; i++) {

            if (target >= matrix[i][0] &&
               matrix[i][matrix[0].length - 1] >= target) {

                row = i;
                break;
            }
        }

        int l = 0;
        int r = matrix[0].length - 1;

        while (l <= r) {

            int mid = (l + r) / 2;

            if (target == matrix[row][mid])
                return true;

            if (target > matrix[row][mid])
                l = mid + 1;
            else
                r = mid - 1;
        }

        return false;
    }
    public static void main(String[] args) {

        SearchA2DMatrix obj = new SearchA2DMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = obj.searchMatrix(matrix, target);

        System.out.println(result);
    }
}