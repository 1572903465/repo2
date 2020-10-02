package Shape;

public class text_Shape {
    public static void main(String[] args) {
        Circle C = new Circle(3);
        C.Circle_Showing(3,C.Circumference(),C.Area());
        System.out.println();
        Triangle T = new Triangle(3,4,5);
        T.Triangle_Showing(3,4,5,T.Circumference(),T.Area());
        System.out.println();
        Rectangle R = new Rectangle(4,5);
        R.Rectangle_Showing(4,5,R.Circumference(),R.Area());
        System.out.println();
        Square S = new Square(5);
        System.out.println("边长为5的正方形的周长为："+S.Circumference());
        System.out.println("边长为5的正方形的面积为:"+S.Area());
    }
}
