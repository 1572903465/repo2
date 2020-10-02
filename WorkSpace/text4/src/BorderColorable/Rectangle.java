package BorderColorable;

public class Rectangle extends Shape2D implements  SolidColorable,BorderColorable{
    private double a,b;
    private boolean isshape=false;
    private boolean isSlidePainted=false;
    public Rectangle(double x, double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double Circumference() {
        return 2*(a+b);
    }
    @Override
    public double Area(){
        return a*b;
    }

    @Override
    public void paintBorder() {
        System.out.println("已将矩形的边进行着色!");
        isSlidePainted = true;
    }

    @Override
    public boolean isBorderPainted() {
        return  isSlidePainted;
    }
    @Override
    public void paintShape() {
        System.out.println("已将矩形进行着色!");
        isshape=true;
    }

    @Override
    public boolean isShapePainted() {
        return isshape;
    }
}
