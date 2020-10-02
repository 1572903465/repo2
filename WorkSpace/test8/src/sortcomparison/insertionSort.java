package sortcomparison;

public class insertionSort extends Thread{
    private  int  p[];
    private  int  num;
    private  int  q[];
    long sumtime=0;
    public insertionSort(int[] q,int num){
        this.q=q;
        this.num=num;
    }
    public void run() {
        for (int k=0;k<num;k++){
            long timestrat;
            long timeend;

            p=q.clone();
            if (p.length == 0) {
                throw new NullPointerException("内容为空，没有要排序的内容！");
            }

            //t1 = System.currentTimeMillis();

            int size = 1;
            timestrat = System.currentTimeMillis();

            while (size < p.length) {
                insertionSort(p, size++, p[size - 1]);
            }

            timeend = System.currentTimeMillis();
            sumtime+=(timeend - timestrat);
            System.out.println("使用插入排序使用的时间是：" + (timeend - timestrat) + "毫秒");
//        System.out.println("排序结果为：");
////
////        for (int i = 0; i < p.length; i++) {
////            System.out.println(p[i]);
////        }

        }
        System.out.println("使用插入排序平均使用的时间是：" +sumtime/num + "毫秒");
    }

    private void insertionSort(int[] p, int size,int c) {

        for (int i = 0; i < size; i++) {
            if (c<p[i]) {
//                System.out.println(p[i]);

                for (int j = size; j > i; j--) {
                    p[j] = p[j - 1];
                }

                p[i] = c;

                break;
            }
        }
    }


}
