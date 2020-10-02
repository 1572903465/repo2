package BorderColorable;

public class Square extends  Rectangle{
    private double x;
    private boolean isSlidePainted=false;
    private boolean  isshape=false;
    public Square(double x){
        super(x,x);
    }
    public void paintBorder() {
        System.out.println("已将正方形的边进行着色!");
        isSlidePainted = true;
    }
    public void paintShape() {
        System.out.println("已将正方形进行着色!");
        isshape=true;
    }
}
