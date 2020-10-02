package BorderColorable;

public class Triangle extends Shape2D implements SolidColorable{
    private double a,b,c;
    private boolean isshape=false;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double Circumference() {
        return a+b+c;
    }

    @Override
    public double Area() {
        double p;
        p=(this.a+this.b+this.c)/2.0;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    public void paintShape() {
        System.out.println("已经将三角形着色！");
        isshape=true;
    }

    @Override
    public boolean isShapePainted() {
        return isshape;
    }
}
