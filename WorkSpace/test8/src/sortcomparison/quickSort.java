package sortcomparison;

public class quickSort extends Thread{
    private int []p;
    private int []q;
    private int num;
    public quickSort (int []q,int num){ //构造方法
        this.q=q;
        this.num=num;
    }
    long timestart;
    long timeend;
    long  sumtime=0;
    public void run(){
        for (int k=0;k<num;k++){
            p=q.clone();
//         for(int j=0;j<p.length;j++){
//             System.out.println("排序前"+p[j]);
//         }
            timestart=System.currentTimeMillis();
            quickSort(p,0,p.length-1);
            timeend=System.currentTimeMillis();
            sumtime+=timeend-timestart;
//        for(int j=0;j<p.length;j++){
//            System.out.println("排序后"+p[j]);
//        }
            System.out.println("使用快速排序使用的时间是：" + (timeend - timestart) + "毫秒");
        }
        System.out.println("使用快速排序平均使用的时间是：" + sumtime/num+ "毫秒");
    }
    public void quickSort(int[] arr, int left, int right) {
        //进行判断，如果左边索引比右边索引大，是不合法的，直接使用return结束这个方法
        if(left>right)
        {
            return;
        }
        //定义变量保存基准数
        int base=arr[left];
        //定义变量i,指向最左边
        int i=left;
        //定义变量j,指向最右边
        int j=right;

        //当i和j不相遇的时候，在循环中进行检索
        while(i!=j)
        {
            //向由j从右往左检索比基准数小的，如果检索到比基准数小的就停下
            //如果检索到比基准数大的或者相等的，就继续检索
            while(arr[j]>=base && i<j)
            {
                j--;    //j从右边往左移动
            }
            while(arr[i]<=base&&i<j)
            {
                i++;	//i从左往右移动
            }
            //代码走到这里，i停下了，j也停下了。然后交换i和j位置的元素
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //如果上面while循环的条件不成立，会跳出这个循环，往下执行
        //如果这个条件不成立说明i和j相遇了
        //如果i和J相遇了，就交换基准数这个元素和相遇位置的元素
        //把相遇位置的元素赋值给基准数这个位置的元素
        arr[left]=arr[i];
        //把基准数赋值给相遇位置的元素
        arr[i]=base;
        //基准数在这里就归为了，左边的数字都比他小，右边的都比他大
        //排基准数的左边

        quickSort(arr, left, i-1);
        //排右边
        quickSort(arr, j+1, right);
    }
}


