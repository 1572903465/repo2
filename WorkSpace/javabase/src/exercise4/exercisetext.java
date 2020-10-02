package exercise4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exercisetext {
    public static void main(String[] args) {
        int arr[] = {1};
        A a = new A();
        arr=a.add(arr);
        System.out.print(arr[0]);
        System.out.println(arr);

    }
//    public  static void add(int arr[]){
//        System.out.println(arr);
//        arr= Arrays.copyOf(arr,arr.length+1);
//        System.out.println(arr);
//        System.out.println(arr.length);
//        arr[0]=5;
//    }
}

class A {
    int arr[] = {1};

    public int[] add(int arr[]) {
        System.out.println(arr);
        arr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(arr);
        System.out.println(arr.length);
        arr[0] = 5;
        return arr;
    }
}
