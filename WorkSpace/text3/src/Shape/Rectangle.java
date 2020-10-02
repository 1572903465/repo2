package Shape;

public class Rectangle extends Shape2D {
    double x;
    double y;
    public Rectangle(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public double Circumference() {
        return 2*(x+y);
    }

    @Override
    public double Area() {
        return x*y;
    }
    public void Rectangle_Showing(double x,double y,double L,double S){
        System.out.printf("边长为%.0f,%.0f的长方形周长为：%.2f\n",x,y,L);
        System.out.printf("边长为%.0f,%.0f的长方形面积为：%.2f\n",x,y,L);
    }

}
