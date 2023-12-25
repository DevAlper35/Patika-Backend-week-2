public class Main {
    public static void main(String[] args) {
        int [][] matrix = { {2,3,4},
                {5,6,4} };
        System.out.println("Before the change");
        printArray(matrix);
        System.out.println("After the change");
        change(matrix);
    }
    static void change (int [][] matrix) {
        //Satır ve sütunları değiştirmek için metot
        int [][] newMatrix = new int [matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                //Satır ve sütunları burada değiştirdik.
                newMatrix[col][rows] = matrix [rows][col];
            }
        }
        printArray(newMatrix);
    }

    static void printArray(int [][] matrix) {
        // Yazdırmak için metot
        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
