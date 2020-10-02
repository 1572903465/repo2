package Complex;

public class text_Complex {
    public static void main(String[] args){
        Complex  c0=new Complex (2,-3);
        Complex  c1=new Complex (c0);
        System.out.print("c1 is: ");
        c1.Display();
        Complex c2=new Complex (3,4);
        System.out.print("c2 is: ");
        c2.Display();
        Complex c3;
        c3 = c1.AddComplex(c2);
        System.out.print("c3 is: ");
        c3.Display();
    }
}
