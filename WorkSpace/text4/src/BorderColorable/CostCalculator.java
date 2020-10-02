package BorderColorable;

public class CostCalculator {
    private double borderCost;
    private double solidCost;
    public CostCalculator(double borderCost,double solidCost){
        this.borderCost=borderCost;
        this.solidCost=solidCost;
    }
    public double calculate(Shape2D shape){
        double a,b;
        a=shape.Circumference()*this.borderCost;
        b=shape.Area()*this.solidCost;
        return a+b;
    }
}