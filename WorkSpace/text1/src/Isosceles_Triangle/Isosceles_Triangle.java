package Isosceles_Triangle;

import java.util.*;
public class Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("请输入梯形的上边长度：");
        x = input.nextInt();
        System.out.print("请输入梯形的层数：");
        y = input.nextInt();
        int m = y;
        int n = x;
        Isosceles_Triangle.Triangle(x, y, m, n);

    }

    public static void Triangle(int a, int b, int c, int d) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c - 1; j++) {
                System.out.print(" ");
            }
            c--;
            for (int k = 0; k < d; k++) {
                System.out.print("*");
            }
            d += 2;
            System.out.println("");
        }
    }
}