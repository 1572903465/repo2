package demo04;

public class Demo4_29 {
    public static void main(String[] args) {
        fun();
        fun(1);
        fun(1,3,5,7);
    }
    public static void fun(int...arg){
        for(int i=0;i<arg.length;i++){
            System.out.print(arg[i]+"、");
        }
    }
}
