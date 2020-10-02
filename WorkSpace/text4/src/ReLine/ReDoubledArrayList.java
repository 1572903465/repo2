package ReLine;
import java.util.Arrays;
import java.util.Arrays.*;
public class ReDoubledArrayList implements ReLine{
    private Object[] arrs;
    private int incSize;
    private int i=0;
    public ReDoubledArrayList(int incSize) {
        this.incSize=incSize;
        if(incSize>0) arrs =new Object[incSize];
        else arrs=new Object[10];
    }

    @Override
    public void add(Object obj) {
        if(i==arrs.length){
            arrs= Arrays.copyOf(arrs,2*arrs.length);
        }
        this.arrs[i]= obj;
        i++;
    }

    @Override
    public Object get(int index) {
        if(index>this.arrs.length){
            System.err.println("error index");
            return null;
        }
        else{
            return this.arrs[index];
        }

    }

    @Override
    public void clear() {
        for(int j=i;j>0;j--){
            this.arrs[j]=null;
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.arrs[0]==null)
            return false;
        else return true;
    }

    @Override
    public int size() {
        return this.arrs.length;
    }

    @Override
    public int capacity() {
        return this.arrs.length*8;
    }
}
