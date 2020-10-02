package demo04;

public class Demo4_15 {
    public static void main(String[] args) {
        System.out.println("计算结果："+sum(100));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }else {
            return num+sum(num-1);
        }
    }
}
