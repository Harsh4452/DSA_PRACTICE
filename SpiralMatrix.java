import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int StartingRow = 0;
        int EndingRow = matrix.length - 1;
        int StartingColumn = 0;
        int EndingColumn = matrix[0].length - 1;

        while (StartingRow <= EndingRow && StartingColumn <= EndingColumn) {
            // top
            for (int j = StartingColumn; j <= EndingColumn; j++) {
                result.add(matrix[StartingRow][j]);
            }

            // right
            for (int i = StartingRow + 1; i <= EndingRow; i++) {
                result.add(matrix[i][EndingColumn]);
            }

            // bottom
            if (StartingRow < EndingRow) {
                for (int j = EndingColumn - 1; j >= StartingColumn; j--) {
                    result.add(matrix[EndingRow][j]);
                }
            }

            // left
            if (StartingColumn < EndingColumn) {
                for (int i = EndingRow - 1; i > StartingRow; i--) {
                    result.add(matrix[i][StartingColumn]);
                }
            }

            StartingRow++;
            EndingRow--;
            StartingColumn++;
            EndingColumn--;
        }

        return result;
    }
}
