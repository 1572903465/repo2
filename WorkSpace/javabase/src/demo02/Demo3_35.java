package demo02;
//打印99乘法表
public class Demo3_35 {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
