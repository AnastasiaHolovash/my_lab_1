import java.util.Random;

public class Lab_2 {
    public static void main(String[] args) {
        final int m = 5;
        final int n = 3;

        short[][] matrixB = new short[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //matrixB[i][j] = (short)(random.nextInt(65536) - 32768);
                matrixB[i][j] = (short)random.nextInt(10);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        short[][] matrixC = new short[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[j][i] = matrixB[i][j];

            }

        }

        System.out.println();
        System.out.println("Transported matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

        short temp;
        int sum = 0;
        for (int j = 0; j < m; j++) {
            temp = matrixC[0][j];

            for (int i = 1; i < n; i++) {
                if (matrixC[i][j] < temp){
                    temp = matrixC[i][j];
                }
            }
            sum += temp;

        }
        System.out.println();
        System.out.println("SUM = " + sum);

    }
}
