package Circle;

public class Circle {
       private double r;
       Point c;
       public Circle(Point c,double r){
           this.c=c;
           this.r=r;
       }
       public boolean isPointIn(Point p){
          double L;
          double x=this.c.getX()-p.getX();
          double y=this.c.getY()-p.getY();
          L=Math.sqrt(x*x+y*y);
          if(L>this.r) return false;
          else return true;
       }
}
