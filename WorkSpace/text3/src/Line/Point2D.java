package Line;

public class Point2D {
    protected double c;
    protected double d;

    public Point2D(double c,double d) {
        this.c=c;
        this.d=d;
    }

    public boolean equals(Object x) {
        if(x instanceof Point2D) {
            Point2D B=(Point2D) x;
            return ((this.c==B.c)&&(this.d==B.d));
        }else {
            return false;
        }
    }
}








