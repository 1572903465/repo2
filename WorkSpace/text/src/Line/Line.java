package Line;

public class Line {
        Point a;
        Point b;
        int count=0;
        public Line(Point a, Point b) {
            this.a=a;
            this.b=b;
            count++;
        }
        public double GetLen(){
            double x=a.getX()-b.getX();
            double y=a.getY()-b.getY();
            double L=Math.sqrt(x*x+y*y);
            return L;
        }
        public int ShowCount(){
            return count;
        }
}
