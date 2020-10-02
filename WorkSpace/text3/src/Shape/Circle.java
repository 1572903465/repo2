package Shape;
        import java.security.PrivateKey;
        import java.util.*;
public  class Circle  extends Shape2D {
    private double r;

    public Circle(double r) {
        super();//调用父类的构造方法
        this.r = r;
    }
    public double Circumference(){
        return 2*r*Math.PI;
    }
    public double Area(){
        return r*r*Math.PI;
    }
    public void Circle_Showing(double r,double L,double s){
        System.out.printf("这个半径为%.0f的圆的周长为：%.2f\n",r,L);
        System.out.printf("这个半径为%.0f的圆的面积为：%.2f\n",r,s);
    }
}
