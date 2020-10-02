package exercise4;

import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
    Array array=new Array();
    array.print();
    array.invertArray();
    array.print();
    }
}


class  Array{
        private int score[]={0,1,2,3,4,5,6,7,8,9};
        public void print(){
            for(int i=0;i<score.length;i++){
                System.out.print(score[i]+"\t");
            }
            System.out.println();
        }
        public void invertArray(){
            int temp[]=new int[this.score.length];
            for(int i=0;i<temp.length;i++){
                temp[i]=this.score[this.score.length-i-1];
            }
            for (int i=0;i<this.score.length;i++){
                this.score[i]=temp[i];
            }
        }

}