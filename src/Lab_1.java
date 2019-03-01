public class Lab_1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int n = 90;
        int m = 5;
        final int C = 1;
        float S = 0;


        if ((0 >= b && 0 <= m) || (-C >= a && -C <= n)) {
            System.out.println("Ділення на нуль:(");
        } else {
            for (int i = a; i <= n; i++) {
                for (int j = b; j < m; j++) {
                    S = S + (float) (i / j) / (i + C);

                }
            }
            System.out.println(S);
        }


        //task* Змінити один символ, щоб
        //вивело 20 "*"
        int N = 20;
        for (int i = 0; -i < N; i--) {
            System.out.println("*");
        }
        N = 20;
        for (int i = 0; i < N; N--) {
            System.out.println("+");
        }

    }
}
