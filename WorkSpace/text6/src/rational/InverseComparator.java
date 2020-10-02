package rational;

public class InverseComparator  implements Comparable<InverseComparator>{
    private int numerator;//·Ö×Ó
    private int denominator;//·ÖÄ¸
    public InverseComparator(int numerator, int denominator){
        this.denominator=denominator;
        this.numerator=numerator;
    }
    public int getNumerator(){
        //System.out.println("zlw");
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    @Override
    public int compareTo(InverseComparator o) {
        if (this.getDenominator() == 0 && o.getDenominator() != 0) return 1;
        else if (this.getDenominator() != 0 && o.getDenominator() == 0) {
            return -1;
        } else if (this.getDenominator() == 0 && o.getDenominator() == 0) {

            return 0;
        } else {
            if(this.getDenominator()*o.getNumerator()<o.getDenominator()*this.getNumerator()){
                return 1;
            }
            else if(this.getDenominator()*o.getNumerator()>this.getNumerator()*o.getDenominator()){
                return -1;
            }
            else{
                return 0 ;
            }

        }

    }
}
