package Line;

public class text_Line {
    public static void main(String[] args){
        Point p1=new Point (1,1);
        Point p2=new Point (4,5);
        Line line1=new Line(p1,p2);
        System.out.println("the length of line1 is: "+line1.GetLen());
        Line line2=new Line(p2,p1);
        System.out.println("The count of line is: "+line1.ShowCount());
    }
}
