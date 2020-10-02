package Complex;

public class Complex {
    private int x;
    private int y;
    public Complex(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Complex(Complex C){
        this.x=C.x;
        this.y=C.y;
    }
    public Complex AddComplex(Complex C){
        C.x=this.x+C.x;
        C.y=this.y+C.y;
        return C;
    }
    public void Display(){
        if (this.y>0)
        System.out.println(this.x+"+"+this.y+"i");
        else
            System.out.println(this.x+""+this.y+"i");

    }
}
