package Matrix_Multiplication;

import java.util.Scanner;

public class Matrix {

    public static void Matrix(int a,int b,int c,int d,int[][] q,int[][] p){
        System.out.println("输入第一个矩阵的值");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                q[i][j] = input.nextInt();
            }
        }

        System.out.println("输入第二个矩阵的值");
        for(int i=0;i<c;i++) {
            for(int j=0;j<d;j++) {
                p[i][j] = input.nextInt();
            }
        }
        // input.close();
        System.out.println("输入成功正在计算...");
    }
    public static void Multplication(int m,int n,int x,int y,int [][]p,int [][]q,int [][]r) {
        int sum = 0;
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < y;j++)
            {
                for(int k = 0;k < n;k++)
                {
                    sum = sum + p[i][k]*q[k][j];

                }
                r[i][j] = sum;
                sum = 0;
            }
        }

    }
    public static void Matrix_show(int a,int b,int[][] q) {

        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                System.out.print(q[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

}
