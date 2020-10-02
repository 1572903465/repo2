package exercise3;
//求10·200累加和
public class exercise05 {
    public static void main(String[] args) {
        int i=100;
        int sum=0;
        System.out.println("sum="+sum);
        while(i<200){
           sum+=i;
           i++;
        }
        System.out.println("sum="+sum);
        i=100;
        sum=0;
        do {
            sum+=i;
            i++;
        }while(i<200);
        System.out.println("sum="+sum);
        sum=0;
        for(int j=100;j<200;j++){
            sum+=j;
        }
        System.out.println("sum="+sum);
    }
}
