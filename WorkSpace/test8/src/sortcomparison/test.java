package sortcomparison;


import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand=new Random(10000);//每次运行都能产生相同的随机数
        int n=rand.nextInt(1000000);//设置一个n较大的随机数组
        int a[] =new int[n];//创建一个随机数n的数组
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n ; i++){
        a[i]=rand.nextInt(10000);
        }

        System.arraycopy(a,0,b,0,n);//不能直接a=b,引用赋值会造成只处理同一块地址的数组
        System.arraycopy(a,0,c,0,n);
       // b=a;
        BubbleSort bubbleSort=new BubbleSort(a,3);
        insertionSort insertionsort=new insertionSort(b,3);
        quickSort quicksort=new quickSort(c,3);
        bubbleSort.start();
        insertionsort.start();
        quicksort.start();
    }
}
