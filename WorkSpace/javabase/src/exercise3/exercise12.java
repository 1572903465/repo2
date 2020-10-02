package exercise3;

public class exercise12 {
    public static void main(String[] args) {
        int t = 5;
        int n = 6;
        for (int i = 1; i < 6; i++) {
            int k = t - i;//输出前面的空白
            for (int j = 1; j < n; j++) {
                if (j > k) {//通过判断输出前面的空白
                    if (i % 2 == 1) {//根据i是奇偶数，确定*的位置
                        if (j % 2 == 1) {//间隔输出*
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                } else {
                    System.out.print(" ");
                }
            }
            n++;
            System.out.println();
        }
        printPhoto();
    }

    public static void printPhoto() {//方法二更简单更直接
        char star = '*', bln = ' ';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {//输出前面的空白
                System.out.print(bln);
            }
            for (int k = 1; k <= i; k++) {//输出图案
                System.out.print(star + " ");
            }
            System.out.println();
        }

    }
}
