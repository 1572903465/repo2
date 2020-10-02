import java.util.Random;

public class Randnumber {
    public int randnum;
    public int size;//几组交互的数据
    public int number=0;
    boolean available=false;
    int count;
    Random rand=new Random();


    public Randnumber(int size){
        this.size=size;
    }
    public synchronized void set(){
        if (available){
            try{
                wait();
            }catch (Exception e){

            }
        }
        randnum=rand.nextInt(20);
        System.out.println("随机数为："+randnum);
        number++;
        available=true;
        notify();
    }
    public synchronized void ave(){

        if(available){

           System.out.println("随机数产生的平方数：" +this.randnum*this.randnum);
            available=false;
            notify();

            if(number==size){
                number=size+1;
            }
        }
    }
}

