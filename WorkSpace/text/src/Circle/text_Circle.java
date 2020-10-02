package Circle;

public class text_Circle {
    public static void main(String[] args){
        int x,y;
        double r;
        x=1;
        y=1;
        r=1.5;
        Point p=new Point (x,y);
        Circle c=new Circle(p,r);
        x=4;
        y=6;
        Point p1=new Point (x,y);
        boolean b = c.isPointIn(p1);
        System.out.println(b);
    }
}
