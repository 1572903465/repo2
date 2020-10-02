package Line;

public class text_Line {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println("Enter the first number:");
        Point2D point1 = new Point2D(1, 2);
        Point2D point2 = new Point2D(2, 4);
        Point2D point3 = new Point2D(3, 4);
        Line2D line1 = new Line2D(point1, point3);
        Line2D line2 = new Line2D(point3, 2);
        if (line1.equals(line2)) {
            System.out.println("两条直线重合");
        } else {
            if (line1.compare(line2)) {
                System.out.println("两条直线平行");
            } else {
                System.out.println("两条直线相交");
            }
        }

    }
}