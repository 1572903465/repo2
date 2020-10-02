package Line;



public class Line2D{
        private double ratio;
        private double a;
        private double b;
        private double tail;

        public Line2D(Point2D x,Point2D y) {
            if(x.equals(y)) {
                System.out.println("两点重合，不能确定唯一一条直线");
            }else {
                ratio=(y.d-x.d)/(y.c-x.c);
                tail=(y.c*x.d-x.c*y.d)/(y.c-x.c);
            }
        }

        public Line2D(Point2D x,double ratio) {
            this.ratio=ratio;
            tail=x.d-x.c*ratio;
        }

        public Line2D(double a,double b) {
            this.a=a;
            this.b=b;
            ratio=-(b/a);
            tail=b;
        }

        public boolean equals(Object A) {
            if(A instanceof Line2D) {
                Line2D B=(Line2D) A;
                return ((this.ratio==B.ratio)&&(this.tail==B.tail));
            }else {
                return false;
            }
        }

        public boolean compare(Line2D s) {
            if(this.ratio==s.ratio) {
                if(this.tail!=s.tail) {
                    return true;
                }
            }else {
                return false;
            }
            return false;

        }
    }
