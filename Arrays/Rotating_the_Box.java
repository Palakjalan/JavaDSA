
public class Rotating_the_Box {

    public char[][] rotateTheBox(char[][] boxGrid) {

        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] rotated = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[i][j] = boxGrid[m - 1 - j][i];
            }
        }

        for (int col = 0; col < m; col++) {

            int empty = n - 1;

            for (int row = n - 1; row >= 0; row--) {

                if (rotated[row][col] == '*') {
                    empty = row - 1;
                }

                else if (rotated[row][col] == '#') {

                    rotated[row][col] = '.';
                    rotated[empty][col] = '#';

                    empty--;
                }
            }
        }

        return rotated;
    }

    public static void main(String[] args) {

        Rotating_the_Box obj = new Rotating_the_Box();

        char[][] boxGrid = {
            {'#', '.', '*', '.'},
            {'#', '#', '*', '.'}
        };

        char[][] result = obj.rotateTheBox(boxGrid);

        for(int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}