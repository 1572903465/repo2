package Shape;

public  class Triangle extends Shape2D{
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double Circumference() {
        return a+b+c;
    }
    public double Area(){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void Triangle_Showing(double a,double b,double c,double L,double S){
        System.out.printf("边长为%.0f,%.0f,%.0f的三角形周长为：%.2f\n",a,b,c,L);
        System.out.printf("边长为%.0f,%.0f,%.0f的三角形面积为：%.2f\n",a,b,c,S);
    }
}
