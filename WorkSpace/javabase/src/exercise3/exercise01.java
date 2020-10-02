package exercise3;
//求水仙花数
public class exercise01 {
    public static void main(String[] ards){
        for(int i=100;i<1000;i++){
            int x=i/100;
            int y=(i%100)/10;
            int z=(i%10);
            if(i==(Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3))){
                System.out.println(i+"="+"("+x+"*3+"+y+"*3+"+z+"*3"+")");
            }
        }
    }
}
