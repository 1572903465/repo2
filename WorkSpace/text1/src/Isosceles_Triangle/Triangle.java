package Isosceles_Triangle;

public class Triangle {
    public static void Triangle1(int a, int b, int c, int d){
        for (int i=0;i<b;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                System.out.print(" ");
            }
            c--;
            for(int k=0;k<d;k++)
            {
                System.out.print("*");
            }
            d+=2;
            System.out.println("");
        }
    }
}