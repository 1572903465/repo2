import java.nio.channels.GatheringByteChannel;
        import java.util.Random;

public class B extends Thread{
    Randnumber r=null;
    public B(Randnumber r){
        this.r=r;
    }
    public void run(){
        //System.out.println("GatheringByteChannel");
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){

        }
        while (r.number <= r.size){
            r.ave();
        }

    }
}
