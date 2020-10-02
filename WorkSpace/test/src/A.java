import java.util.Random;

public class A extends Thread{
      Randnumber r=null;

      public A(Randnumber r){
          this.r=r;
      }
      public void run(){
          while (r.number<r.size){
              r.set();
          }

          try {
              Thread.sleep(100);
          }catch (InterruptedException e){

          }
    }

}
