package exercise3;
//求13-23+33-43+...+993-1003
public class exercise06 {
    public static void main(String[] args) {
        sum2();
        sum1();
    }
    public static void sum1(){ //方法一
        int sum=0,i=13,j=23;
        while(i<=1003) {
            sum +=(i-j);
            i=i+20;
            j=j+20;
        }
        System.out.println(sum);

    }
    public static void sum2(){ //方法二
        int i=13;
        int sum=0;
        boolean flag = true;
        while(Math.abs(i)<1004){
            System.out.println(i);
            System.out.println(flag);
            if(flag){
                sum+=i;
            }
            else{
                sum-=i;
            }
            flag=!flag;
            i+=10;

        };
        System.out.println(sum);
    }
}

