package BorderColorable;

public  class Circle extends Shape2D implements SolidColorable{
    private double r;
    private boolean isshape=false;
    public Circle(double r){
        this.r=r;
    }
    @Override
    public double Area() {
        return Math.PI*r*r;
    }
    @Override
    public double Circumference(){
        return Math.PI*2*this.r;
    }
    @Override
    public void  paintShape(){
        System.out.println("已经将圆染色");
        isshape=true;
    }

    @Override
    public boolean isShapePainted() {
        return isshape;
    }

}
