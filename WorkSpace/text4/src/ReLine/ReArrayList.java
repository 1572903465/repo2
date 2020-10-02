package ReLine;
import java.util.Arrays;
import  java.util.Arrays.*;
public class ReArrayList implements ReLine{
    public Object[] arr;
    private int incSize;
    private int i=0;
    public ReArrayList(int  incSize){
        this.incSize=incSize;
        if(incSize>0) arr =new Object[incSize];
        else arr=new Object[5];
    }

        @Override
        public void add(Object obj) {
            if(i==arr.length){
                  arr = Arrays.copyOf(arr,arr.length+this.incSize);
            }
            this.arr[i]= obj;
            i++;
        }

        @Override
        public Object get(int index) {
            if(index>this.arr.length){
                System.err.println("error index");
                return null;
            }
            else{
                return this.arr[index];
            }

        }

        @Override
        public void clear() {
              for(int j=i;j>0;j--){
                  this.arr[j]=null;
              }
        }

        @Override
        public boolean isEmpty() {
        if(this.arr[0]==null)
            return false;
        else return true;
        }

        @Override
        public int size() {
            int k,a= arr.length-1;
            if(arr[a]!=null) return arr.length;
            else {
                a=0;
                for (k = 0; this.arr[k] != null && k < this.arr.length; k++) {
                    a++;
                }
                return a;
            }
        }

        @Override
        public int capacity() {
            return this.arr.length;
        }


}
