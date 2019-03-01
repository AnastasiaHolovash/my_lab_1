public class Lab_2 {
    public static void main(String[] args) {

        short[][] matrixB = {
                {-9, 1, 0, 2},
                { 4, 1, 1, 4},
                {-2, 2,-1,-5},
                { 0, 3,-4, 0}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                short temp = matrixB[i][j];
                matrixB[i][j] = matrixB[j][i];
                matrixB[j][i] = temp;
            }
        }

        System.out.println("Transported matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        short temp1;
        short temp2;
        for (int j = 0; j < 4; j++) {
            if (matrixB[0][j] < matrixB[1][j]){
                temp1 = matrixB[0][j];
                temp2 = matrixB[1][j];
            }else {
                temp1 = matrixB[1][j];
                temp2 = matrixB[0][j];
            }

            for (int i = 2; i < 4; i++) {
                if (matrixB[i][j] < temp2){
                    temp2 = matrixB[i][j];
                }
                else if (matrixB[i][j] < temp1){
                    temp2 = temp1;
                    temp1 = matrixB[i][j];
                }
            }
            int sum = temp1 + temp2;
            System.out.println("sum"+ (j+1) + "= " + sum);
        }
    }
}
