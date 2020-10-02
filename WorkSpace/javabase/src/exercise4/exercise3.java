package exercise4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        int oldArr[] = {1, 3,4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int oldArr2[] = {1, 3,4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int newArr2[]={};
        int sum=0;
        int j=0;
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                sum++;
            }
        }
        int newArr[] = new int[sum];
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                newArr[j]=oldArr[i];
                j++;
            }
        }
        for(int i=0;i<oldArr.length;i++){
            int l=newArr2.length;
            newArr2=add(l,oldArr2[i],newArr2);
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr2[i]+"\t");
        }
    }
    public static int[] add(int l,int value, int Arr[]) {//方法二 返回数组
       // System.out.print(l+"\t "+value);
        if (value == 0) {
         ;
        } else {
            Arr= Arrays.copyOf(Arr,Arr.length+1);
            Arr[Arr.length-1] = value;
            //System.out.print("newArr="+Arr[l]+"l="+Arr.length);
        }
        return Arr;
    }
}
