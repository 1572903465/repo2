package demo05;

public class Demo5_57 {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("输入的参数的个数不足三个，程序退出");
            System.exit(1);
        }
        for (int x=0;x<args.length;x++){
            System.out.println(args[x]);
        }
    }
}
